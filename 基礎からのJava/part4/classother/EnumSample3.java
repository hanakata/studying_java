enum job {
    officeworker("0A"), employed("0B"), neet("05"), other("99");

    private final String code;

    Job(String code){
        this.code = code;
    }

    String getJobCode() {
        return code;
    }
}

class EnumSample3 {
    public static void main(String[] args) {
        Job job = job.valueOf("neet");
        System.out.println(job.name());
        System.out.println(job.getJobCode());
    }
}