package wipro_training_day_3;

class Patient {
    private String name;
    private String disease;

    public void setDetails(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public String getDetails() {
        return "Name: " + name + ", Disease: " + disease;
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.setDetails("Raja", "Headache");
        System.out.println(p.getDetails());
    }
}
