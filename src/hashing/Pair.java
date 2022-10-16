package hashing;

public class Pair {
	
	int key;
    int value;
    
	public Pair(int key, int value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (key != other.key)
			return false;
		if (value != other.value)
			return false;
		return true;
	}
    
    

}
