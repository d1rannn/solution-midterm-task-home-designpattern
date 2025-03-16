Here is your README.md file in Markdown format:

# Smart Home Control System

## Overview
The **Smart Home Control System** is a simulation of how various smart devices (e.g., lights, thermostats, security cameras) are managed and controlled using **design patterns**. The project demonstrates the implementation of multiple design patterns to structure and organize a complex system efficiently.

## Design Patterns Implemented

### 1. Composite Pattern
- The `SmartDevice` interface is used to represent both individual devices (leaf nodes) and groups of devices (composite nodes).
- `Light` and `Thermostat` are individual devices that implement `SmartDevice`.
- `Room` acts as a composite node, containing multiple `SmartDevice` instances and enabling control of all devices within it.

### 2. Decorator Pattern
- Used to add extra functionality to devices dynamically without modifying their original classes.
- `SmartDeviceDecorator` is an abstract class that extends `SmartDevice`.
- `LoggingDecorator` is a concrete implementation that logs when a device is turned on or off.

### 3. Abstract Factory Pattern
- Used to create families of related devices with a consistent interface.
- `SmartHomeFactory` defines methods for creating `Light` and `Thermostat` devices.
- `BasicSmartHomeFactory` produces standard devices.
- `AdvancedSmartHomeFactory` produces high-end devices with advanced features.

### 4. Adapter Pattern
- Used to integrate an external or legacy system into the smart home environment.
- `LegacyDoorLock` is a pre-existing class that does not conform to `SmartDevice`.
- `DoorLockAdapter` wraps around `LegacyDoorLock`, making it compatible with the rest of the system.

### 5. Facade Pattern
- Provides a simplified interface for managing the entire system.
- `SmartHomeController` acts as a central control unit for all devices.
- Methods like `turnAllOn()` and `turnAllOff()` allow bulk control of devices without needing to access each individually.

## Project Structure
```
SmartHomeControlSystem/
│── src/
│   ├── devices/
│   │   ├── SmartDevice.java
│   │   ├── Light.java
│   │   ├── Thermostat.java
│   │   ├── Room.java
│   ├── decorators/
│   │   ├── SmartDeviceDecorator.java
│   │   ├── LoggingDecorator.java
│   ├── factories/
│   │   ├── SmartHomeFactory.java
│   │   ├── BasicSmartHomeFactory.java
│   │   ├── AdvancedSmartHomeFactory.java
│   ├── adapters/
│   │   ├── LegacyDoorLock.java
│   │   ├── DoorLockAdapter.java
│   ├── facade/
│   │   ├── SmartHomeController.java
│   ├── SmartHomeDemo.java
│── README.md
```

## How to Run
1. Compile all Java files using:
   ```sh
   javac src/**/*.java

	2.	Run the demo:

java src.SmartHomeDemo



Demo Functionality
•	Adds devices (Lights, Thermostats) to a room.
•	Wraps devices with decorators (Logging feature).
•	Uses a facade to control multiple devices at once.
•	Integrates a legacy door lock system using an adapter.
•	Turns all devices on and off through the SmartHomeController.

Future Enhancements
•	Implement a GUI-based interface.
•	Add more decorators such as ScheduledOperationDecorator.
•	Expand device support with more smart appliances.

⸻

This project is a demonstration of design patterns and how they help in structuring a maintainable and scalable software system.

You can now **copy and paste** this directly into your `README.md` file. Let me know if you need any changes! 🚀