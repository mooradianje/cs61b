class NegativeFinder {
    
    public static boolean hasNegative(XList L){
        for (int i = 0; i < L.size(); i += 1) {
            if(L.get(i) < 0) {
                return true;
            }
        
        }
    return false;
    }
}