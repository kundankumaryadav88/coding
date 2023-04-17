public class Maximum_Number_of_Words_Found_in_Sentences{

    // public static int mostWordsFound(String[] sentences) {
    
    //     int n = sentences.length;
    //     int maxword = 0;
    //     for(int i =0 ;i < n; i++){
    //         String sen = sentences[i];
    //         int wordcount = 0;
    //         for(int j = 0; j < sen.length();j++){
    //             if(sen.charAt(j) == ' '){
    //                 wordcount++;
    //             }
    //         }
    //         maxword = Math.max(maxword, wordcount + 1);
    //     }
        

    //     return maxword;
        
    // }
    public static int mostWordsFound(String[] sentences) {
    
        int maxword = 0;
        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            maxword = Math.max(maxword, words.length );
        }

        return maxword;
        
    }
    public static void main(String[] args){
        String[] word = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int k = mostWordsFound(word);
        System.out.println(k);
    }
}