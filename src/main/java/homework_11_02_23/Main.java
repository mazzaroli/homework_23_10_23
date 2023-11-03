package homework_11_02_23;

import homework_11_02_23.components.CPU;
import homework_30_10_23.components.*;
import homework_30_10_23.computer.Computer;
import homework_30_10_23.devices.Desktop;
import homework_30_10_23.devices.Laptop;
import homework_30_10_23.devices.Tablet;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Creating instances of CPU, GPU, RAM, Keyboard, Monitor, and Mouse
        homework_11_02_23.components.CPU cpu = new homework_11_02_23.components.CPU("Core i7","Intel ",2.6);
        homework_11_02_23.components.GPU gpu3080 = new homework_11_02_23.components.GPU("Nvidia RTX 3080", 12, 1710);
        homework_11_02_23.components.GPU gpuAMD = new homework_11_02_23.components.GPU("AMD Radeon RX 7900XT", 20, 2535);
        homework_11_02_23.components.GPU gpu4090 = new homework_11_02_23.components.GPU("Nvidia RTX 4090", 24, 2610);
        homework_11_02_23.components.RAM ram = new homework_11_02_23.components.RAM(16);
        homework_11_02_23.components.Keyboard keyboard = new homework_11_02_23.components.Keyboard("Mechanical");
        homework_11_02_23.components.Monitor monitor = new homework_11_02_23.components.Monitor("27-inch 4K");
        homework_11_02_23.components.Mouse mouse = new homework_11_02_23.components.Mouse("Wireless");

        // Creating instances of Desktop, Laptop, and Tablet that are subclasses of the Computer class
        Desktop desktop = new Desktop("ATX","Dell", "XPS 9000", cpu, gpuAMD, ram, keyboard, monitor, mouse);
        Laptop laptop = new Laptop(48,"Lenovo", "ThinkPad X1", cpu, gpu3080, ram, keyboard, monitor, mouse);
        Tablet tablet = new Tablet(true,"Apple", "iPad Pro", cpu, gpu4090, ram, keyboard, monitor, mouse);
        Computer desktopPoly = new Desktop("ATX","Dell", "XPS 9000", cpu, gpuAMD, ram, keyboard, monitor, mouse);

        // Creating defaults instances of Desktop, Laptop, and Tablet
        Desktop desktopDefault = new Desktop();
        Laptop laptopDefault = new Laptop();
        Computer tabletDefault = new Tablet();
        homework_11_02_23.components.CPU cpuDefault = new CPU();

        // Printing information about various devices and components
        System.out.println();
        desktop.printInfo();

        System.out.println();
        tablet.printInfo();

        System.out.println();
        laptop.printInfo();

        System.out.println();
        desktopDefault.printInfo();

        System.out.println();
        tabletDefault.printInfo();

        System.out.println();
        laptopDefault.printInfo();

        System.out.println();
        cpu.displayDetails();

        System.out.println();
        cpuDefault.displayDetails();


        // Override methods from Computer.java
        System.out.println("\nOverride methods from Computer.java:");
        System.out.println(desktop.toString());
        System.out.println(desktop.hashCode());
        System.out.println(desktop.equals(desktopPoly));
        System.out.println(desktop.equals(desktopDefault));

        // Override methods from CPU.java
        System.out.println("\nOverride methods from CPU.java:");
        System.out.println(cpu.toString());
        System.out.println(cpu.hashCode());
        System.out.println(cpu.equals(cpu.hashCode()));
        System.out.println(cpu.equals(cpu));

        // Override methods from Monitor.java
        System.out.println("\nOverride methods from Monitor.java:");
        System.out.println(monitor.toString());
        System.out.println(monitor.hashCode());
        System.out.println(monitor.equals(monitor));
        System.out.println(monitor.equals(cpu));
    }
}