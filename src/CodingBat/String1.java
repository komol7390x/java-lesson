package CodingBat;

public class String1 {
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,4);
    }

    public String firstHalf(String str) {
        return  str.substring(0,str.length()/2);
    }

    public String nonStart(String a, String b) {
        return  a.substring(1)+b.substring(1);
    }

    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }else {
            return  str.substring(str.length()-1);
        }
    }

    public boolean endsLy(String str) {
        if(str.length()<2 || str.isEmpty()) return  false;
        return  str.substring(str.length()-2).equals("ly");
    }

    public String middleThree(String str) {
        return  str.substring(str.length()/2-1,str.length()/2+2);
    }

    public String lastChars(String a, String b) {
        String first=(a.length()>0)? a.substring(0,1):"@";
        String second=(b.length()>0)? b.substring(b.length()-1):"@";
        return  first+second;
    }

    public String seeColor(String str) {
        return  str.startsWith("red")?"red":str.startsWith("blue")?"blue":"";
    }

    public String extraFront(String str) {
        int len = Math.min(str.length(), 2);
        String front = str.substring(0, len);
        return front + front + front;
    }
    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        if (str.startsWith(word.substring(1), 1)) {
            return str.substring(0, word.length());
        }
        return  "";
    }

    public String makeAbba(String a, String b) {
    return a+b+b+a;
    }

    public String extraEnd(String str) {
        String string=str.substring(str.length()-2);
        return string.repeat(3);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
    public String left2(String str) {
        if(str.length()<=2) return  str;
        return str.substring(2)+str.substring(0,2);
    }

    public String withouEnd2(String str) {
        if(str.length() <= 2) return "";
        return  str.substring(1,str.length()-1);
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n)+ str.substring(str.length()-n);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) return a + b;
        if (a.charAt(a.length() - 1) == b.charAt(0)) return a + b.substring(1);
        return a + b;
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2)return false;
        String front = str.substring(0, 2);
        String end = str.substring(str.length() - 2);
        return front.equals(end);
        }
}
