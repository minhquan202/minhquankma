package Controller;
import java.awt.Component;
import javax.swing.JScrollPane;

import View.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class RadioButtonListener implements ItemListener{
	 private view this$0;

	private RadioButtonListener(final view this$0) {
	        this.this$0 = this$0;
	    }
	    
	    @Override
	    public void itemStateChanged(final ItemEvent e) {
	        if (e.getSource() == this.this$0.radioBtnBaoHiemOto && this.this$0.radioBtnBaoHiemOto.isSelected()) {
	            this.this$0.tabbedPane.removeTabAt(0);
	            final JScrollPane scrollPane = new JScrollPane(this.this$0.pnBaoHiemOto, 22, 30);
	            this.this$0.tabbedPane.addTab("B\u1ea3o hi\u1ec3m \u00d4t\u00f4", scrollPane);
	        }
	        if (e.getSource() == this.this$0.radioBtnBaoHiemNha && this.this$0.radioBtnBaoHiemNha.isSelected()) {
	            this.this$0.tabbedPane.removeTabAt(0);
	            final JScrollPane scrollPane = new JScrollPane(this.this$0.pnBaoHiemNha, 22, 30);
	            this.this$0.tabbedPane.addTab("B\u1ea3o hi\u1ec3m nh\u00e0", scrollPane);
	        }
	        if (e.getSource() == this.this$0.radioBtnBaoHiemThuNhap && this.this$0.radioBtnBaoHiemThuNhap.isSelected()) {
	            this.this$0.tabbedPane.removeTabAt(0);
	            final JScrollPane scrollPane = new JScrollPane(this.this$0.pnBaoHiemThuNhap, 22, 30);
	            this.this$0.tabbedPane.addTab("B\u1ea3o hi\u1ec3m thu nh\u1eadp", scrollPane);
	        }
	    }
}
