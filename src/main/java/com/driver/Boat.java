package com.driver;

 class Boat implements WaterVehicle {
    private String name;
    private int capacity;

     public String getName() {
         return this.name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Boat(String name, int capacity) {
         this.name = name;
         this.capacity = capacity;
     }

     public int getCapacity() {
         return this.capacity;
     }

     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }

     @Override
     public String getVehicleName() {
         return name;
     }

     @Override
     public int getVehicleCapacity() {
         return capacity;
     }
 }
