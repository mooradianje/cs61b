class MaxSListLauncher2 {
    public static void main(String[] args) {
        SList msl = new MaxSList(100);
        msl.insertFront(50);
        SList sl = msl;
        //way to get around subtype issues - stating that we know
        //that sl is actually a dynamic type of MaxSList
        MaxSList msl10 = (MaxSList) sl;
        System.out.println(msl10.max());
        
        //fail code 
        SList justAnSList = new SList(5);
        //THIS PART WILL NOT WORK
        //((MaxSList) justAnSList).max();
    }
    
}