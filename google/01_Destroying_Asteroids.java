class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int[] masses = new int[100002];
        
        for(int i : asteroids){
            masses[i]++;
        }
        
        int n = masses.length;
        long planetMass = mass;
        
        for(int i=0 ; i<n ; i++){
            if(masses[i] == 0){
                continue;
            }
            if(planetMass < i){
                return false;
            }
            planetMass += (i * masses[i]);
        }
        
        return true;
    }
}
