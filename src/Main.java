public class Main {
    public static void main(String[] agrs){
        Package pkgs[];
        pkgs = Package.getPackages();
        for(int i=0; i<pkgs.length; i++)
            System.out.println(
                    pkgs[i].getName() + "" +
                    pkgs[i].getImplementationTitle() + "" +
                    pkgs[i].getImplementationVendor() + "" +
                    pkgs[i].getImplementationVersion() + ""
            );

    }
}
