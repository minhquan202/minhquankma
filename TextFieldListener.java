package Controller;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import View.view;
public class TextFieldListener implements DocumentListener{
	private view this$0;

	private TextFieldListener(final view this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void insertUpdate(final DocumentEvent e) {
        this.this$0.docDuLieu();
    }
    
    @Override
    public void removeUpdate(final DocumentEvent e) {
        this.this$0.docDuLieu();
    }
    
    @Override
    public void changedUpdate(final DocumentEvent e) {
        this.this$0.docDuLieu();
    }
}
