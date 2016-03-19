package laboration5;
import java.util.Arrays;

public class DynamicString  {
	private char[] chars;
	private int length;
	
	public DynamicString() {
		chars = new char[10];  
	}
	
	public DynamicString( DynamicString str ) {
		chars = Arrays.copyOf(str.chars, str.length);
		length = str.length;
	}
	
	public DynamicString(String str) {
		chars = str.toCharArray();
		length = chars.length;
	}
	
	public void add(char chr) {
		add(length,chr);
	}
	
	public void add(int index, char chr) {
		checkIndex(index,length);
		if(length==chars.length) {
			chars = Arrays.copyOf(chars,chars.length*2);
		}
    	for(int i=length; i>index;i--) {
    		chars[i] = chars[i-1];
    	}
    	chars[index] = chr;
    	length++;
	}
	
	public void remove(int index) {
		checkIndex(index,length-1);
        for(int i=index+1; i<length; i++) {
			chars[i-1] = chars[i];
		}
        length--;
	}
	
	public String toString() {
		return new String(chars, 0, length);
	}	
	
	// tas upp på föreläsning 14
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash = 31 * hash + chars[i];
        }
        return hash;
    }
    
    // kontroll av index
	private void checkIndex(int index, int max) {
		if(index<0 || index>max) {
			throw new IndexOutOfBoundsException("index: "+index+", range: 0-"+max);
		}
	}

	public int length(){
        return length;
    }

    public char charAt(int index){
        return chars[index];
    }
    public void removeAll() {
        length = 0;
    }
    public int indexOf(char chr) {
        for (int i = 0; i < length; i++){
            if(chars[i] == chr){
                return i;
            }
        }
        return -1;
    }

    public DynamicString substring(int start, int end){
        checkIndex(start,end);
        checkIndex(end,length);
        DynamicString substring = new DynamicString();
        for (int i = start; i < end; i++) {
            substring.add(chars[i]);
        }
        return substring;
    }
    public DynamicString substring(int start) {
        return substring(start,length);
    }

    public static void main(String[] args) {
		DynamicString ds1 = new DynamicString();            // ds1 -> DynamicString med längden 0
		DynamicString ds2 = new DynamicString("Hej Lisa!"); // ds2 -> DynamicString med 'H','e','j',' ','L','i','s','a','!'
		DynamicString ds3 = new DynamicString(ds2);         // ds3 -> DynamicString med 'H','e','j',' ','L','i','s','a','!'
		System.out.println("ds1: " + ds1);
		System.out.println("ds2: " + ds2);
		System.out.println("ds3: " + ds3);
		ds1.add('J');                                       // ds1 -> 'J'
		ds1.add('a');                                       // ds1 -> 'J','a'
		ds1.add('a');                                       // ds1 -> 'J','a','a'
		ds1.add(2,'v');                                     // ds1 -> 'J','a','v','a'
		ds2.remove(4);                                      // ds2 -> 'H','e','j',' ','i','s','a','!'
		ds2.remove(4);                                      // ds2 -> 'H','e','j',' ','s','a','!'
		System.out.println("ds1: " + ds1);
		System.out.println("ds2: " + ds2);
		System.out.println("ds3: " + ds3);
	}
}
