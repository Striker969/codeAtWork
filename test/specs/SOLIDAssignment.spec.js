// E-commerce order management system

// Interfaces (ISP and DIP)
class IPaymentprocessor {
    processPayment(amount) {
        throw new Error("processpayment method must be implemented");
    }
}

class IStockmanager {
    checkStock() {
        throw new Error("checkStock method must be implemented");
    }
    updateStock(quantity) {
        throw new Error("updateStock method must be implemented");
    }
}

// Product Class (SRP and ISP)
class Product extends IStockmanager {
    constructor(name, price, stock) {
        super();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    getDetails() {
        return `${this.name} - $${this.price}, Stock: ${this.stock}`;
    }
    checkStock() {
        return this.stock > 0;
    }
    updateStock(quantity) {
        if (this.stock >= quantity) {
            this.stock -= quantity;
        } else {
            throw new Error(`Insufficient stock for ${this.name}`);
        }
    }
}

// customer class (SRP)
class Customer {
    constructor(name, email, address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
    getContactInfo() {
        return `${this.name} - ${this.email}`;
    }
}

// invoiceGenerator Class (SRP)
class InvoiceGenerator {
    generateInvoice(order) {
        console.log("Invoice Generated:");
        console.log(`Customer: ${order.customer.getContactInfo()}`);
        console.log(`Products:`);
        order.products.forEach(product => {
            console.log(`- ${product.name} x ${order.quantities[product.name]} = $${product.price * order.quantities[product.name]}`);
        });
        console.log(`Total: $${order.getTotal()}`);
    }
}

// Paymentprocessor implementation (OCP, LSP)
class Creditcardprocessor extends IPaymentprocessor {
    processPayment(amount) {
        console.log(`Credit Card Payment of $${amount} processed.`);
    }
}

class Paypalprocessor extends IPaymentprocessor {
    processPayment(amount) {
        console.log(`PayPal Payment of $${amount} processed.`);
    }
}

// order class (SRP and Stock Management)
class Order {
    constructor(customer) {
        this.customer = customer;
        this.products = [];
        this.quantities = {};
    }
    addProduct(product, quantity) {
        if (product.checkStock()) {
            this.products.push(product);
            this.quantities[product.name] = quantity;
        } else {
            throw new Error(`Product ${product.name} is out of stock`);
        }
    }
    getTotal() {
        return this.products.reduce((total, product) => total + product.price * this.quantities[product.name], 0);
    }
}

// orderProcessor class (DIP and OCP)
class OrderProcessor {
    constructor(paymentProcessor, invoiceGenerator) {
        this.paymentProcessor = paymentProcessor;
        this.invoiceGenerator = invoiceGenerator;
    }
    processOrder(order, paymentType) {
        console.log("Processing Order...");
        // to update stock
        order.products.forEach(product => {
            product.updateStock(order.quantities[product.name]);
        });

        // to process payment
        this.paymentProcessor.processPayment(order.getTotal());

        // to generate invoice
        this.invoiceGenerator.generateInvoice(order);

        console.log("Order Processed Successfully!");
    }
}

const customer = new Customer("Alice", "alice@example.com", "123 Wonderland Ave");
const product1 = new Product("Laptop", 1000, 5);
const product2 = new Product("Headphones", 200, 10);

const invoiceGenerator = new InvoiceGenerator();
const paymentProcessor = new Creditcardprocessor();
const orderProcessor = new OrderProcessor(paymentProcessor, invoiceGenerator);

const order = new Order(customer);
order.addProduct(product1, 1);
order.addProduct(product2, 2);

// process the order
orderProcessor.processOrder(order);
