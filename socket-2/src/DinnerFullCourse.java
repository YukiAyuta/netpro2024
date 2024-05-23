package src;

public class DinnerFullCourse {
	private Dish[] list = new Dish[5];// [0]-[4]の計5個

	public static void main(String[] args) {

		DinnerFullCourse fullcourse = new DinnerFullCourse();
		fullcourse.eatAll();
	}

	DinnerFullCourse() {

		for (int i = 0; i < list.length; i++) {
			list[i] = new Dish();
		}
		list[0].setName("ミートドリア");
		list[0].setValune(300);
		list[1].setName("アサリの和風パスタ");
		list[1].setValune(600);
		list[2].setName("小エビのサラダ");
		list[2].setValune(400);
		list[3].setName("マルゲリータピザ");
		list[3].setValune(500);
		list[4].setName("プリン");
		list[4].setValune(300);
	}

		public static void eatAll() {

		String a = "";
		
		for (Dish element : list) {
			a += element.getName() + "の値段は" + element.getValune() + "です。";
		}

		System.out.println(a);
	}
}
