package practice.practice15;

public class Practice15_3 {
	
//	全ての文字列
	s.matches(".*")
	
//	最初の文字列はA、2文字目は数字、3文字目は数字か無し
	s.matches("A\d{1,2}")
	
//	最初の1文字はU、2～4文字目は英大文字
	s.matches("U[A-Z]{3}")
}
