public class SoccerScores {

	public static boolean isPossible(int score, int gameCount) {
		ArrayList<Integer> possibleResults = new ArrayList<Integer>(){3,1,0};
		ArrayList<String> results = new ArrayList<String>();
		String combi = "";
		results= combine(gamecount,possibleResults,combi,results);
		
		ArrayList<Integer> numResults = new ArrayList<Integer>();
		for(int i = 0;i<results.size();i++)
		{
			int current = 0;
			char[] temp = results.get(i).toCharArray();
			for(int j = 0;j<temp.length;j++){
				current+=Character.getNumericValue(temp[i]);
			}
			numResults.add(current);
		}
		
		if(numResults.contains(score)){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public static ArrayList<String> combine(int gameCount,ArrayList<Integer> possibleResults, String combi,ArrayList<String> results){
		if(gameCount == 0){
			results.add(combi);
			return results;
		}else{
			for (int i = 0; i < possibleResults.size(); i++){
			String NewCombi = combi + String.valueOf(possibleResults.get(i));
			Combine(gameCount-1, possibleResults, NewCombi,results);
			}
		
	}
}
}
