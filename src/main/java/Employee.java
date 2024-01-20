public class Employee {

    private String Gstin;
    private String TradeName;
    private String LegalName;
    private String AddrBnm;
    private String AddrBno;
    private String AddrFlno;
    private String AddrSt;
    private String AddrLoc;
    private String StateCode;
    private String AddrPncd;
    private String TxpType;
    private String BlkStatus;
    private String DtReg;
    private String DtDReg;

    public Employee(){
        super();
    }

    public Employee(String gstin, String tradeName, String legalName, String addrBnm, String addrBno, String addrFlno, String addrSt, String addrLoc, String stateCode, String addrPncd, String txpType, String blkStatus, String dtReg, String dtDReg) {
        Gstin = gstin;
        TradeName = tradeName;
        LegalName = legalName;
        AddrBnm = addrBnm;
        AddrBno = addrBno;
        AddrFlno = addrFlno;
        AddrSt = addrSt;
        AddrLoc = addrLoc;
        StateCode = stateCode;
        AddrPncd = addrPncd;
        TxpType = txpType;
        BlkStatus = blkStatus;
        DtReg = dtReg;
        DtDReg = dtDReg;
    }

    public String getGstin() {
        return Gstin;
    }

    public void setGstin(String gstin) {
        Gstin = gstin;
    }

    public String getTradeName() {
        return TradeName;
    }

    public void setTradeName(String tradeName) {
        TradeName = tradeName;
    }

    public String getLegalName() {
        return LegalName;
    }

    public void setLegalName(String legalName) {
        LegalName = legalName;
    }

    public String getAddrBnm() {
        return AddrBnm;
    }

    public void setAddrBnm(String addrBnm) {
        AddrBnm = addrBnm;
    }

    public String getAddrBno() {
        return AddrBno;
    }

    public void setAddrBno(String addrBno) {
        AddrBno = addrBno;
    }

    public String getAddrFlno() {
        return AddrFlno;
    }

    public void setAddrFlno(String addrFlno) {
        AddrFlno = addrFlno;
    }

    public String getAddrSt() {
        return AddrSt;
    }

    public void setAddrSt(String addrSt) {
        AddrSt = addrSt;
    }

    public String getAddrLoc() {
        return AddrLoc;
    }

    public void setAddrLoc(String addrLoc) {
        AddrLoc = addrLoc;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }

    public String getAddrPncd() {
        return AddrPncd;
    }

    public void setAddrPncd(String addrPncd) {
        AddrPncd = addrPncd;
    }

    public String getTxpType() {
        return TxpType;
    }

    public void setTxpType(String txpType) {
        TxpType = txpType;
    }



    public String getBlkStatus() {
        return BlkStatus;
    }

    public void setBlkStatus(String blkStatus) {
        BlkStatus = blkStatus;
    }

    public String getDtReg() {
        return DtReg;
    }

    public void setDtReg(String dtReg) {
        DtReg = dtReg;
    }

    public String getDtDReg() {
        return DtDReg;
    }

    public void setDtDReg(String dtDReg) {
        DtDReg = dtDReg;
    }

    //    public Employee(String name, String city, String department, String designation) {
//        this.name = name;
//        this.city = city;
//        this.department = department;
//        this.designation = designation;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
}
