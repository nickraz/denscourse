public class Main {

    public static void main(String[] args) {
        Organization organization = new Organization();
        organization.add("K1\\SK1");
        organization.add("K1\\SK2");
        organization.add("K1\\SK1\\SSK1");
        organization.add("K1\\SK1\\SSK2");
        organization.add("K2");
        organization.add("K2\\SK1");
        organization.add("K2\\SK1\\SSK1");
        organization.add("K2\\SK1\\SSK2");

        organization.printAll(false);
    }

}
