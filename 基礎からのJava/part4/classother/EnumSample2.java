class EnumSample2 {
    public static void main(String[] args) {
        BloodType type = BloodType.valueOf("B");
        System.out.println(type.name());
        System.out.println(type == BloodType.A);
        System.out.println(type == BloodType.B);

        BloodType[] values = BloodType.values();
        for (BloodType value : values) {
            System.out.println(value + ",");
        }
    }
}