//Balam Ruchith Balaji
 

class Laptop {
    private String processor;
    private String memory;
    private String disk;

    public Laptop(String processor, String memory, String disk) {
        this.processor = processor;
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Laptop [Processor=" + processor + ", Memory=" + memory + ", Disk=" + disk + "]";
    }
}

class LaptopBuilder {
    private String processor;
    private String memory;
    private String disk;

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public LaptopBuilder setDisk(String disk) {
        this.disk = disk;
        return this;
    }

    public Laptop build() {
        return new Laptop(processor, memory, disk);
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Laptop myLaptop = new LaptopBuilder()
                .setProcessor("AMD Ryzen 9")
                .setMemory("16GB")
                .setDisk("512GB SSD")
                .build();

        System.out.println(myLaptop);
    }
}
