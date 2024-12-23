//OOP ASSIGNMENT


// this is the Base Animal class
class Animal {
    constructor(name, species, age, health_status = 'Healthy', adoption_status = 'Available') {
        this.name = name;
        this.species = species;
        this.age = age;
        this.health_status = health_status;
        this.adoption_status = adoption_status;
    }

    //here i am achieving encapsulation(Use getters/setters to access private attributes if necessary)
    display_info() {
        console.log(`${this.name} - ${this.species} - ${this.age} years old - Health: ${this.health_status} - Status: ${this.adoption_status}`);
    }
    update_health_status(status) {
        this.health_status = status;
    }
    update_adoption_status(status) {
        this.adoption_status = status;
    }
}

// derived Dog Class
class Dog extends Animal {
    constructor(name, age, breed, trained) {
        super(name, 'Dog', age);
        this.breed = breed;
        this.trained = trained;
    }

    // overriding display_info() for dog-specific info
    display_info() {
        console.log(`${this.name} - ${this.breed} - Trained: ${this.trained ? 'Yes' : 'No'} - Health: ${this.health_status} - Status: ${this.adoption_status}`);
    }
}

// Derived Cat Class
class Cat extends Animal {
    constructor(name, age, color, indoor) {
        super(name, 'Cat', age);
        this.color = color;
        this.indoor = indoor;
    }

    // overriding display_info() for cat-specific info
    display_info() {
        console.log(`${this.name} - ${this.color} - Indoor: ${this.indoor ? 'Yes' : 'No'} - Health: ${this.health_status} - Status: ${this.adoption_status}`);
    }
}

// derived Bird Class
class Bird extends Animal {
    constructor(name, age, wing_span, can_fly) {
        super(name, 'Bird', age);
        this.wing_span = wing_span;
        this.can_fly = can_fly;
    }
    // overriding dislay_info() for bird-specific info
    display_info() {
        console.log(`${this.name} - Wing Span: ${this.wing_span}m - Can Fly: ${this.can_fly ? 'Yes' : 'No'} - Health: ${this.health_status} - Status: ${this.adoption_status}`);
    }
}

// staff Class
class Staff {
    constructor(staff_id, name, role) {
        this.staff_id = staff_id;
        this.name = name;
        this.role = role;
        this.tasks = [];
    }

    assign_task(task) {
        this.tasks.push(task);
    }

    display_tasks() {
        console.log(`${this.name}'s Tasks:`);
        this.tasks.forEach(task => {
            console.log(task);
        });
    }
}

// adopter Class
class Adopter {
    constructor(adopter_id, name, contact_info) {
        this.adopter_id = adopter_id;
        this.name = name;
        this.contact_info = contact_info;
        this.adopted_animals = [];
    }

    adopt_animal(animal) {
        this.adopted_animals.push(animal);
        animal.update_adoption_status('Adopted');
        console.log(`${this.name} has adopted ${animal.name}.`);
    }

    display_adopted_animals() {
        console.log(`${this.name}'s Adopted Animals:`);
        this.adopted_animals.forEach(animal => {
            animal.display_info();
        });
    }
}

    // animal shelter system
class AnimalShelter {
    constructor() {
        this.animals = [];
        this.staff = [];
        this.adopters = [];
    }
    add_animal(animal) {
        this.animals.push(animal);
    }

    display_all_animals() {
        console.log("All Animals:");
        this.animals.forEach(animal => {
            animal.display_info();
        });
    }

    get_available_animals() {
        return this.animals.filter(animal => animal.adoption_status === 'Available');
    }

    get_adopted_animals() {
        return this.animals.filter(animal => animal.adoption_status === 'Adopted');
    }
    add_staff(staff_member) {
        this.staff.push(staff_member);
    }
    add_adopter(adopter) {
        this.adopters.push(adopter);
    }
}

const shelter = new AnimalShelter();

// adding animals
const dog1 = new Dog("Buddy", 3, "Labrador", true);
const cat1 = new Cat("Whiskers", 2, "Gray", true);
const bird1 = new Bird("Sky", 1, 1.5, true);

shelter.add_animal(dog1);
shelter.add_animal(cat1);
shelter.add_animal(bird1);

// adding staff
const staff1 = new Staff(101, "Alice", "Vet");
staff1.assign_task("Check health of Buddy");
staff1.assign_task("Feed the animals");
shelter.add_staff(staff1);

// adding adopter
const adopter1 = new Adopter(201, "John", "123-456-7890");
shelter.add_adopter(adopter1);

// display animals and adopt one
shelter.display_all_animals();
adopter1.adopt_animal(dog1);
shelter.display_all_animals();

// update health status
dog1.update_health_status("Healthy");
staff1.display_tasks();




