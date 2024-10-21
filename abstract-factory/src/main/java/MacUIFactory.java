
public class MacUIFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new MacCheckBox();
	}

}
