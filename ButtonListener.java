package Controller;
import Model.Insured;
import java.util.Calendar;
import Model.IncomeProtection;
import Model.InsuredHouse;
import View.view;
import Model.InsuredCar;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonListener implements ActionListener{

    private int tuoiKH;
    private int namMuaBaoHiemOto;
    private int namKtraBaoHiemOto;
    private int doRateTaiXe;
    private double thuNhapKH;
    private double giaTriOto;
    private int namMuaBaoHiemNha;
    private int namKtraBaoHiemNha;
    private double giaTriNha;
    private double giaTriVatDung;
	private view this$0;
    
    private ButtonListener(final view this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.this$0.exitMenu) {
            System.exit(0);
        }
        if (e.getSource() == this.this$0.aboutMenu) {
            final String strAuthorInfor = "T\u00e1c gi\u1ea3: Ph\u1ea1m Ng\u1ecdc H\u1ea3i\nMSSV: 20207601\nEmail: hai.pn207601@sis.hust.edu.vn\n";
            JOptionPane.showMessageDialog((Component)this.this$0, strAuthorInfor, "Th\u00f4ng tin", 1);
        }
        if (e.getSource() == this.this$0.btnTinhChiPhi) {
            if (this.this$0.radioBtnBaoHiemOto.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemOto()) {
                    final Insured baoHiemOto = (Insured)new InsuredCar(this.this$0.hangSanXuat, this.this$0.mauXe, this.this$0.bienSo, this.namMuaBaoHiemOto, this.giaTriOto, this.this$0.tenKH, this.doRateTaiXe, this.tuoiKH);
                    final double chiPhiBaoHiem = baoHiemOto.getInsurancePremium(this.namKtraBaoHiemOto);
                    JOptionPane.showMessageDialog((Component)this.this$0, "Chi ph\u00ed b\u1ea3o hi\u1ec3m \u00f4 t\u00f4 l\u00e0: " + String.format("%.2f", chiPhiBaoHiem) + "$");
                }
            }
            if (this.this$0.radioBtnBaoHiemNha.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemNha()) {
                    final Insured baoHiemNha = (Insured)new InsuredHouse(this.this$0.tenKH, this.tuoiKH, this.this$0.diaChiKH, this.giaTriNha, this.namMuaBaoHiemNha, this.giaTriVatDung);
                    final double chiPhiBaoHiem = baoHiemNha.getInsurancePremium(this.namKtraBaoHiemNha);
                    JOptionPane.showMessageDialog((Component)this.this$0, "Chi ph\u00ed b\u1ea3o hi\u1ec3m nh\u00e0 l\u00e0: " + String.format("%.2f", chiPhiBaoHiem) + "$");
                }
            }
            if (this.this$0.radioBtnBaoHiemThuNhap.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH()) {
                    final Insured baoHiemThuNhap = (Insured)new IncomeProtection(this.this$0.tenKH, this.tuoiKH, this.thuNhapKH);
                    final double chiPhiBaoHiem = baoHiemThuNhap.getInsurancePremium(Calendar.getInstance().get(1));
                    JOptionPane.showMessageDialog((Component)this.this$0, "Chi ph\u00ed b\u1ea3o hi\u1ec3m thu nh\u1eadp l\u00e0: " + String.format("%.2f", chiPhiBaoHiem) + "$");
                }
            }
        }
        if (e.getSource() == this.this$0.btnTinhGiaTri) {
            if (this.this$0.radioBtnBaoHiemOto.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemOto()) {
                    final Insured baoHiemOto = (Insured)new InsuredCar(this.this$0.hangSanXuat, this.this$0.mauXe, this.this$0.bienSo, this.namMuaBaoHiemOto, this.giaTriOto, this.this$0.tenKH, this.doRateTaiXe, this.tuoiKH);
                    final double giaTriBaoHiem = baoHiemOto.getInsuranceValue(this.namKtraBaoHiemOto);
                    JOptionPane.showMessageDialog((Component)this.this$0, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m \u00f4 t\u00f4 l\u00e0: " + String.format("%.2f", giaTriBaoHiem) + "$");
                }
            }
            if (this.this$0.radioBtnBaoHiemNha.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemNha()) {
                    final Insured baoHiemNha = (Insured)new InsuredHouse(this.this$0.tenKH, this.tuoiKH, this.this$0.diaChiKH, this.giaTriNha, this.namMuaBaoHiemNha, this.giaTriVatDung);
                    final double giaTriBaoHiem = baoHiemNha.getInsuranceValue(this.namKtraBaoHiemNha);
                    JOptionPane.showMessageDialog((Component)this.this$0, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m nh\u00e0 l\u00e0: " + String.format("%.2f", giaTriBaoHiem) + "$");
                }
            }
            if (this.this$0.radioBtnBaoHiemThuNhap.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH()) {
                    final Insured baoHiemThuNhap = (Insured)new IncomeProtection(this.this$0.tenKH, this.tuoiKH, this.thuNhapKH);
                    final double giaTriBaoHiem = baoHiemThuNhap.getInsuranceValue(Calendar.getInstance().get(1));
                    JOptionPane.showMessageDialog((Component)this.this$0, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m thu nh\u1eadp l\u00e0: " + String.format("%.2f", giaTriBaoHiem) + "$");
                }
            }
        }
        if (e.getSource() == this.this$0.btnXuatThongTin) {
            if (this.this$0.radioBtnBaoHiemOto.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemOto()) {
                    final String strTenKhachHang = "H\u1ecd v\u00e0 t\u00ean: " + this.this$0.tenKH + "\n";
                    final String strTuoiKhachHang = "Tu\u1ed5i: " + this.tuoiKH + "\n";
                    final String strDiaChiKhachHang = "\u0110\u1ecba ch\u1ec9: " + this.this$0.diaChiKH + "\n";
                    final String strThuNhapKhachHang = "Thu nh\u1eadp hi\u1ec7n t\u1ea1i: " + String.format("%.2f", this.thuNhapKH) + "$\n";
                    final String strHangXe = "H\u00e3ng xe: " + this.this$0.hangSanXuat + "\n";
                    final String strMauXe = "M\u1eabu xe: " + this.this$0.mauXe + "\n";
                    final String strBienSo = "Bi\u1ec3n s\u1ed1: " + this.this$0.bienSo + "\n";
                    final String strNamMuaBaoHiem = "N\u0103m mua b\u1ea3o hi\u1ec3m: " + this.namMuaBaoHiemOto + "\n";
                    final String strNamKtraGiaTriBaoHiem = "N\u0103m ki\u1ec3m tra gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + this.namKtraBaoHiemOto + "\n";
                    final Insured baoHiemOto2 = (Insured)new InsuredCar(this.this$0.hangSanXuat, this.this$0.mauXe, this.this$0.bienSo, this.namMuaBaoHiemOto, this.giaTriOto, this.this$0.tenKH, this.doRateTaiXe, this.tuoiKH);
                    final double chiPhiBaoHiem2 = baoHiemOto2.getInsurancePremium(this.namKtraBaoHiemOto);
                    final double giaTriBaoHiem2 = baoHiemOto2.getInsuranceValue(this.namKtraBaoHiemOto);
                    final String strChiPhiBaoHiem = "Chi ph\u00ed b\u1ea3o hi\u1ec3m: " + String.format("%.2f", chiPhiBaoHiem2) + "$\n";
                    final String strGiaTriBaoHiem = "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + String.format("%.2f", giaTriBaoHiem2) + "$\n";
                    JOptionPane.showMessageDialog((Component)this.this$0, String.valueOf(strTenKhachHang) + strTuoiKhachHang + strDiaChiKhachHang + strThuNhapKhachHang + strHangXe + strMauXe + strBienSo + strNamMuaBaoHiem + strNamKtraGiaTriBaoHiem + strChiPhiBaoHiem + strGiaTriBaoHiem, "B\u1ea3o hi\u1ec3m \u00d4t\u00f4", 1);
                }
            }
            if (this.this$0.radioBtnBaoHiemNha.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemNha()) {
                    final String strTenKhachHang = "H\u1ecd v\u00e0 t\u00ean: " + this.this$0.tenKH + "\n";
                    final String strTuoiKhachHang = "Tu\u1ed5i: " + this.tuoiKH + "\n";
                    final String strDiaChiKhachHang = "\u0110\u1ecba ch\u1ec9: " + this.this$0.diaChiKH + "\n";
                    final String strThuNhapKhachHang = "Thu nh\u1eadp hi\u1ec7n t\u1ea1i: " + String.format("%.2f", this.thuNhapKH) + "$\n";
                    final String strNamMuaBaoHiem2 = "N\u0103m mua b\u1ea3o hi\u1ec3m: " + this.namMuaBaoHiemNha + "\n";
                    final String strNamKtraGiaTriBaoHiem2 = "N\u0103m ki\u1ec3m tra gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + this.namKtraBaoHiemNha + "\n";
                    final Insured baoHiemNha2 = (Insured)new InsuredHouse(this.this$0.tenKH, this.tuoiKH, this.this$0.diaChiKH, this.giaTriNha, this.namMuaBaoHiemNha, this.giaTriVatDung);
                    final double chiPhiBaoHiem3 = baoHiemNha2.getInsurancePremium(this.namKtraBaoHiemNha);
                    final double giaTriBaoHiem3 = baoHiemNha2.getInsuranceValue(this.namKtraBaoHiemNha);
                    final String strChiPhiBaoHiem2 = "Chi ph\u00ed b\u1ea3o hi\u1ec3m: " + String.format("%.2f", chiPhiBaoHiem3) + "$\n";
                    final String strGiaTriBaoHiem2 = "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + String.format("%.2f", giaTriBaoHiem3) + "$\n";
                    JOptionPane.showMessageDialog((Component)this.this$0, String.valueOf(strTenKhachHang) + strTuoiKhachHang + strDiaChiKhachHang + strThuNhapKhachHang + strNamMuaBaoHiem2 + strNamKtraGiaTriBaoHiem2 + strChiPhiBaoHiem2 + strGiaTriBaoHiem2, "B\u1ea3o hi\u1ec3m nh\u00e0", 1);
                }
            }
            if (this.this$0.radioBtnBaoHiemThuNhap.isSelected()) {
                this.this$0.docDuLieu();
                if (this.kiemTraThongTinKH()) {
                    final String strTenKhachHang = "H\u1ecd v\u00e0 t\u00ean: " + this.this$0.tenKH + "\n";
                    final String strTuoiKhachHang = "Tu\u1ed5i: " + this.tuoiKH + "\n";
                    final String strDiaChiKhachHang = "\u0110\u1ecba ch\u1ec9: " + this.this$0.diaChiKH + "\n";
                    final String strThuNhapKhachHang = "Thu nh\u1eadp hi\u1ec7n t\u1ea1i: " + String.format("%.2f", this.thuNhapKH) + "$\n";
                    final Insured baoHiemThuNhap2 = (Insured)new IncomeProtection(this.this$0.tenKH, this.tuoiKH, this.thuNhapKH);
                    final double giaTriBaoHiem4 = baoHiemThuNhap2.getInsuranceValue(Calendar.getInstance().get(1));
                    final double chiPhiBaoHiem3 = baoHiemThuNhap2.getInsurancePremium(Calendar.getInstance().get(1));
                    final String strChiPhiBaoHiem3 = "Chi ph\u00ed b\u1ea3o hi\u1ec3m thu nh\u1eadp: " + String.format("%.2f", chiPhiBaoHiem3) + "$\n";
                    final String strGiaTriBaoHiem3 = "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m thu nh\u1eadp: " + String.format("%.2f", giaTriBaoHiem4) + "$\n";
                    JOptionPane.showMessageDialog((Component)this.this$0, String.valueOf(strTenKhachHang) + strTuoiKhachHang + strDiaChiKhachHang + strThuNhapKhachHang + strChiPhiBaoHiem3 + strGiaTriBaoHiem3, "B\u1ea3o hi\u1ec3m thu nh\u1eadp", 1);
                }
            }
        }
        if (e.getSource() == this.this$0.comboRateTaiXe) {
            this.this$0.rateTaiXe = (String)this.this$0.comboRateTaiXe.getSelectedItem();
        }
    }
    
    private boolean kiemTraThongTinKH() {
        if (this.this$0.tenKH.equals("") || this.this$0.strTuoiKH.equals("") || this.this$0.diaChiKH.equals("") || this.this$0.strThuNhapKH.equals("")) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Th\u00f4ng tin kh\u00e1ch h\u00e0ng kh\u00f4ng \u0111\u01b0\u1ee3c \u0111\u1ec3 tr\u1ed1ng!", "Error", 0);
            return false;
        }
        try {
            this.tuoiKH = Integer.parseInt(this.this$0.strTuoiKH);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Tu\u1ed5i kh\u00e1ch h\u00e0ng kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        try {
            this.thuNhapKH = Double.parseDouble(this.this$0.strThuNhapKH);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Thu nh\u1eadp kh\u00e1ch h\u00e0ng kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        return true;
    }
    
    private boolean kiemTraThongTinBaoHiemOto() {
        if (this.this$0.hangSanXuat.equals("") || this.this$0.mauXe.equals("") || this.this$0.bienSo.equals("") || this.this$0.strNamMuaBHOto.equals("") || this.this$0.strGiaTriOto.equals("") || this.this$0.strNamKtraBHOto.equals("") || this.this$0.rateTaiXe.equals("")) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Th\u00f4ng tin b\u1ea3o hi\u1ec3m kh\u00f4ng \u0111\u01b0\u1ee3c \u0111\u1ec3 tr\u1ed1ng!", "Error", 0);
            return false;
        }
        try {
            this.namMuaBaoHiemOto = Integer.parseInt(this.this$0.strNamMuaBHOto);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "N\u0103m mua b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        try {
            this.giaTriOto = Double.parseDouble(this.this$0.strGiaTriOto);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        try {
            this.namKtraBaoHiemOto = Integer.parseInt(this.this$0.strNamKtraBHOto);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "N\u0103m ki\u1ec3m tra kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        this.doRateTaiXe = Integer.parseInt(this.this$0.rateTaiXe);
        return true;
    }
    
    private boolean kiemTraThongTinBaoHiemNha() {
        if (this.this$0.strNamMuaBHNha.equals("") || this.this$0.strGiaTriNha.equals("") || this.this$0.strGiaTriVatDung.equals("") || this.this$0.strNamKtraBHNha.equals("")) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Th\u00f4ng tin b\u1ea3o hi\u1ec3m kh\u00f4ng \u0111\u01b0\u1ee3c \u0111\u1ec3 tr\u1ed1ng!", "Error", 0);
            return false;
        }
        try {
            this.namMuaBaoHiemNha = Integer.parseInt(this.this$0.strNamMuaBHNha);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "N\u0103m mua b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        try {
            this.giaTriNha = Double.parseDouble(this.this$0.strGiaTriNha);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        try {
            this.giaTriVatDung = Double.parseDouble(this.this$0.strGiaTriVatDung);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "Gi\u00e1 tr\u1ecb v\u1eadt d\u1ee5ng kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        try {
            this.namKtraBaoHiemNha = Integer.parseInt(this.this$0.strNamKtraBHNha);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog((Component)this.this$0, "N\u0103m mua b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
            return false;
        }
        return true;
    }
}
