package 第13章.sampleCode;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",10000));
            bindir.add(new File("latex",20000));
            rootdir.accept(new ListVisitor());
            System.out.println("");
            System.out.println("Making user entries");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            usrdir.add(yuki);
            usrdir.add(hanako);
            yuki.add(new File("diary.html",100));
            hanako.add(new File("diary.html",200));
            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
