import java.util.Arrays;


// this barely works
public class App {
    public static void main(String arg[]) {
        String s = "anagram";
        String t = "nangram";

        isAnagram(s, t);
    }

    // IDK what i did here its wrong
    public static boolean isAnagram(String s, String t) {
        char s_array_[] =  new char[s.length()];
        char t_array_[] = new char[t.length()];

        // Loop over each letter and add it to the array
        for(int i = 0; i < s.length(); i++) {
            s_array_[i] = s.charAt(i);
        }

        for(int i = 0; i < t.length(); i++) {
            t_array_[i] = t.charAt(i);
        }

        // Sort the arrays
        Arrays.sort(s_array_);
        Arrays.sort(t_array_);

        return s_array_.equals(t_array_);
    }

    // Correct Solution
    public boolean isAnagramLeetcode(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}
