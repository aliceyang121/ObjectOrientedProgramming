package model;

public class TextbookBag {
	private Textbook[] textbookArray;
	private int nElems = 0;
	
	public TextbookBag (int maxSize) {
		textbookArray = new Textbook [maxSize];
	}

	public void insert(Textbook textbook) {
		textbookArray[nElems] = textbook;
		nElems++;
	}
	
	public Textbook deleteByIsbn(int isbn) {
		int i=-1;
		for (i=0; i<nElems; i++) {
			if (textbookArray[i].getIsbn().equals(isbn))
				break;
		}
		
		if (i == nElems)
			return null;
		else {
			Textbook temp = textbookArray[i];
			for (int j=i; j<nElems-1; j++) {
				textbookArray[j] = textbookArray[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Textbook search(int isbn) {
		for (int i=0; i<nElems; i++) {
			if (textbookArray[i].getIsbn().equals(isbn)) {
				return textbookArray[i];
			}
		}
		return null;
	}
	
	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(textbookArray[i].toString());
		}
	}
}
