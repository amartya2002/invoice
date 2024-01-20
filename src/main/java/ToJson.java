import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Scanner;

public class ToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter GSTIN : ");
            String gstin = scanner.nextLine();

            System.out.print("Enter Trade Name of the GSTIN: ");
            String tradeName = scanner.nextLine();

            System.out.print("Enter Legal Name of the GSTIN: ");
            String legalName = scanner.nextLine();

            System.out.print("Enter Address: ");
            String addrBnm = scanner.nextLine();

            System.out.print("Enter Address: ");
            String addrBno = scanner.nextLine();

            System.out.print("Enter Floor number: ");
            String addrFlno = scanner.nextLine();

            System.out.print("Enter Street: ");
            String addrSt = scanner.nextLine();

            System.out.print("Enter Location: ");
            String addrLoc = scanner.nextLine();

            System.out.print("Enter State Code: ");
            String stateCode = scanner.nextLine();

            System.out.print("Enter PIN code: ");
            String addrPncd = scanner.nextLine();

            System.out.print("Enter Taxpayer Type: ");
            String txpType = scanner.nextLine();

//            System.out.print("Enter employee designation: ");
//            String status = scanner.nextLine();

            System.out.print("Enter Block Status: ");
            String blkStatus = scanner.nextLine();

            System.out.print("Enter Date of Registration: ");
            String dtReg = scanner.nextLine();

            System.out.print("Enter Date of De-registration: ");
            String dtDReg = scanner.nextLine();


            Employee employee = new Employee(
                    gstin, tradeName, legalName, addrBnm, addrBno, addrFlno, addrSt, addrLoc, stateCode, addrPncd, txpType, blkStatus, dtReg, dtDReg
            );

            objectMapper.writeValue(new File("target/invoice.json"), employee);
        } catch(final Exception e){
            e.printStackTrace();
        }
    }
}
