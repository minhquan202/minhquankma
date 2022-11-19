package View;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.event.DocumentEvent;
	import java.awt.event.ItemEvent;
	import Model.Insured;
	import Model.IncomeProtection;
	import Model.InsuredHouse;
	import Model.InsuredCar;
	import javax.swing.JOptionPane;
	import java.awt.event.ActionEvent;
	import javax.swing.UIManager;
	import javax.swing.event.DocumentListener;
	import java.awt.event.ItemListener;
	import java.awt.event.ActionListener;
	import java.awt.FlowLayout;
	import javax.swing.JScrollPane;
	import java.util.Calendar;
	import javax.swing.AbstractButton;
	import javax.swing.ButtonGroup;
	import javax.swing.border.Border;
	import javax.swing.border.TitledBorder;
	import javax.swing.BorderFactory;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Container;
	import javax.swing.BoxLayout;
	import java.awt.Component;
	import java.awt.Font;
	import javax.swing.JLabel;
	import java.awt.LayoutManager;
	import java.awt.BorderLayout;
	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import java.util.Objects;
	import java.net.URL;
	import javax.swing.KeyStroke;
	import java.awt.Toolkit;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPanel;
	import javax.swing.JTabbedPane;
	import javax.swing.JComboBox;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JRadioButton;
	import javax.swing.JFrame;
	public class view extends JFrame {

		private JPanel contentPane;
		public JRadioButton radioBtnBaoHiemOto;
	    public JRadioButton radioBtnBaoHiemNha;
	    public JRadioButton radioBtnBaoHiemThuNhap;
	    public JButton btnTinhChiPhi;
	    public JButton btnTinhGiaTri;
	    public JButton btnXuatThongTin;
	    private JTextField txtTenKH;
	    private JTextField txtTuoiKH;
	    private JTextField txtDiaChiKH;
	    private JTextField txtThuNhapKH;
	    private JTextField txtHangSanXuat;
	    private JTextField txtMauXe;
	    private JTextField txtBienSo;
	    private JTextField txtNamMuaBHOto;
	    private JTextField txtGiaTriDinhGiaOto;
	    private JTextField txtNamKtraBHOto;
	    public JComboBox<String> comboRateTaiXe;
	    private JTextField txtNamMuaBaoHiemNha;
	    private JTextField txtGiaTriDinhGiaNha;
	    private JTextField txtGiaTriVatDung;
	    private JTextField txtNamKtraBaoHiemNha;
	    public JTabbedPane tabbedPane;
	    public JPanel pnBaoHiemOto;
	    public JPanel pnBaoHiemNha;
	    public JPanel pnBaoHiemThuNhap;
	    public String tenKH;
	    public String strTuoiKH;
	    public String diaChiKH;
	    public String strThuNhapKH;
	    public String hangSanXuat;
	    public String mauXe;
	    public String bienSo;
	    public String strNamMuaBHOto;
	    public String strGiaTriOto;
	    public String strNamKtraBHOto;
	    public String rateTaiXe;
	    public String strNamMuaBHNha;
	    public String strGiaTriNha;
	    public String strGiaTriVatDung;
	    public String strNamKtraBHNha;
	    public JMenuItem exitMenu;
	    public JMenuItem aboutMenu;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						view frame = new view("Quản Lý Bảo Hiểm");
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public view(final String title) {
			super(title);
	        this.addControls();
	        this.addEvents();
		}
		private void addControls() {
			this.setSize(800, 600);
			this.setDefaultCloseOperation(3);
			this.setLocationRelativeTo(null);
	        final JMenuBar menuBar = new JMenuBar();
	        final JMenu menuFile = new JMenu("File");
	        menuFile.setMnemonic('F');
	        (this.exitMenu = new JMenuItem("Exit")).setAccelerator(KeyStroke.getKeyStroke(81, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
	        //this.exitMenu.setIcon(new ImageIcon(Objects.requireNonNull(view.class.getResource("/images/exit.png"))));
	        menuFile.add(this.exitMenu);
	        menuBar.add(menuFile);
	        final JMenu menuHelp = new JMenu("Help");
	        menuHelp.setMnemonic('H');
	        (this.aboutMenu = new JMenuItem("About")).setAccelerator(KeyStroke.getKeyStroke(73, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
	       // this.aboutMenu.setIcon(new ImageIcon(Objects.requireNonNull(view.class.getResource("/images/about.png"))));
	        menuHelp.add(this.aboutMenu);
	        menuBar.add(menuHelp);
	        this.setJMenuBar(menuBar);
	        final JPanel pnTenCongTy = new JPanel();
	        pnTenCongTy.setLayout(new BorderLayout());
	        final JLabel lblTenCongTy = new JLabel("B\u1ea3o hi\u1ec3m Th\u1ecbnh V\u01b0\u1ee3ng");
	       // lblTenCongTy.setIcon(new ImageIcon(Objects.requireNonNull(view.class.getResource("/images/logoCongTy.png"))));
	        lblTenCongTy.setFont(new Font("Serif", 1, 28));
	        lblTenCongTy.setHorizontalAlignment(0);
	        lblTenCongTy.setVerticalAlignment(0);
	        pnTenCongTy.add(lblTenCongTy, "Center");
	        final JPanel pnChonLoaiBaoHiem = new JPanel();
	        pnChonLoaiBaoHiem.setLayout(new BoxLayout(pnChonLoaiBaoHiem, 1));
	        pnChonLoaiBaoHiem.setPreferredSize(new Dimension(230, 0));
	        final Border borderChonLoaiBaoHiem = BorderFactory.createLineBorder(Color.BLUE);
	        final TitledBorder titledBorderChonLoaiBaoHiem = new TitledBorder(borderChonLoaiBaoHiem, "Ch\u1ecdn lo\u1ea1i b\u1ea3o hi\u1ec3m");
	        titledBorderChonLoaiBaoHiem.setTitleJustification(1);
	        titledBorderChonLoaiBaoHiem.setTitleFont(new Font("Serif", 1, 15));
	        titledBorderChonLoaiBaoHiem.setTitleColor(Color.RED);
	        pnChonLoaiBaoHiem.setBorder(titledBorderChonLoaiBaoHiem);
	        (this.radioBtnBaoHiemOto = new JRadioButton("B\u1ea3o hi\u1ec3m \u00f4 t\u00f4")).setFont(new Font("Serif", 1, 15));
	        (this.radioBtnBaoHiemNha = new JRadioButton("B\u1ea3o hi\u1ec3m nh\u00e0")).setFont(new Font("Serif", 1, 15));
	        (this.radioBtnBaoHiemThuNhap = new JRadioButton("B\u1ea3o hi\u1ec3m thu nh\u1eadp")).setFont(new Font("Serif", 1, 15));
	        this.radioBtnBaoHiemOto.doClick();
	        final ButtonGroup radioBtnGroup = new ButtonGroup();
	        radioBtnGroup.add(this.radioBtnBaoHiemOto);
	        radioBtnGroup.add(this.radioBtnBaoHiemNha);
	        radioBtnGroup.add(this.radioBtnBaoHiemThuNhap);
	        pnChonLoaiBaoHiem.add(this.radioBtnBaoHiemOto);
	        pnChonLoaiBaoHiem.add(this.radioBtnBaoHiemNha);
	        pnChonLoaiBaoHiem.add(this.radioBtnBaoHiemThuNhap);
	        final JPanel pnThongTin = new JPanel();
	        pnThongTin.setLayout(new BorderLayout());
	        final JPanel pnThongTinKhachHang = new JPanel();
	        pnThongTinKhachHang.setLayout(new BoxLayout(pnThongTinKhachHang, 1));
	        final Border borderThongTinKH = BorderFactory.createLineBorder(Color.BLUE);
	        final TitledBorder titledBorderThongTinKH = new TitledBorder(borderThongTinKH, "Th\u00f4ng tin kh\u00e1ch h\u00e0ng");
	        titledBorderThongTinKH.setTitleJustification(1);
	        titledBorderThongTinKH.setTitleFont(new Font("Serif", 1, 15));
	        titledBorderThongTinKH.setTitleColor(Color.RED);
	        pnThongTinKhachHang.setBorder(titledBorderThongTinKH);
	        final JLabel lblTenKH = new JLabel("H\u1ecd v\u00e0 t\u00ean: ");
	        final JLabel lblTuoiKH = new JLabel("Tu\u1ed5i: ");
	        final JLabel lblDiaChiKH = new JLabel("\u0110\u1ecba ch\u1ec9: ");
	        final JLabel lblThuNhapHienTaiKH = new JLabel("Thu nh\u1eadp hi\u1ec7n t\u1ea1i ($):");
	        lblTenKH.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        lblTuoiKH.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        lblDiaChiKH.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JPanel pnTenKH = new JPanel();
	        pnTenKH.setLayout(new BorderLayout());
	        pnTenKH.setBorder(BorderFactory.createEmptyBorder(10, 30, 5, 50));
	        final JPanel pnLblTenKH = new JPanel();
	        pnLblTenKH.setLayout(new BorderLayout());
	        pnLblTenKH.add(lblTenKH, "North");
	        final JPanel pnTxtTenKH = new JPanel();
	        pnTxtTenKH.setLayout(new BorderLayout());
	        pnTxtTenKH.add(this.txtTenKH = new JTextField(), "North");
	        pnTenKH.add(pnLblTenKH, "West");
	        pnTenKH.add(pnTxtTenKH, "Center");
	        final JPanel pnTuoiKH = new JPanel();
	        pnTuoiKH.setLayout(new BorderLayout());
	        pnTuoiKH.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 50));
	        final JPanel pnLblTuoiKH = new JPanel();
	        pnLblTuoiKH.setLayout(new BorderLayout());
	        pnLblTuoiKH.add(lblTuoiKH, "North");
	        final JPanel pnTxtTuoiKH = new JPanel();
	        pnTxtTuoiKH.setLayout(new BorderLayout());
	        pnTxtTuoiKH.add(this.txtTuoiKH = new JTextField(), "North");
	        pnTuoiKH.add(pnLblTuoiKH, "West");
	        pnTuoiKH.add(pnTxtTuoiKH, "Center");
	        final JPanel pnDiaChiKH = new JPanel();
	        pnDiaChiKH.setLayout(new BorderLayout());
	        pnDiaChiKH.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 50));
	        final JPanel pnLblDiaChiKH = new JPanel();
	        pnLblDiaChiKH.setLayout(new BorderLayout());
	        pnLblDiaChiKH.add(lblDiaChiKH, "North");
	        final JPanel pnTxtDiaChiKH = new JPanel();
	        pnTxtDiaChiKH.setLayout(new BorderLayout());
	        pnTxtDiaChiKH.add(this.txtDiaChiKH = new JTextField(), "North");
	        pnDiaChiKH.add(pnLblDiaChiKH, "West");
	        pnDiaChiKH.add(pnTxtDiaChiKH, "Center");
	        final JPanel pnThuNhapKH = new JPanel();
	        pnThuNhapKH.setLayout(new BorderLayout());
	        pnThuNhapKH.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 50));
	        final JPanel pnLblThuNhapKH = new JPanel();
	        pnLblThuNhapKH.setLayout(new BorderLayout());
	        pnLblThuNhapKH.add(lblThuNhapHienTaiKH, "North");
	        final JPanel pnTxtThuNhapKH = new JPanel();
	        pnTxtThuNhapKH.setLayout(new BorderLayout());
	        pnTxtThuNhapKH.add(this.txtThuNhapKH = new JTextField(), "North");
	        pnThuNhapKH.add(pnLblThuNhapKH, "West");
	        pnThuNhapKH.add(pnTxtThuNhapKH, "Center");
	        pnThongTinKhachHang.add(pnTenKH);
	        pnThongTinKhachHang.add(pnTuoiKH);
	        pnThongTinKhachHang.add(pnDiaChiKH);
	        pnThongTinKhachHang.add(pnThuNhapKH);
	        final JPanel pnThongTinBaoHiem = new JPanel();
	        pnThongTinBaoHiem.setLayout(new BorderLayout());
	        final Border borderThongTinBH = BorderFactory.createLineBorder(Color.BLUE);
	        final TitledBorder titledBorderThongTinBH = new TitledBorder(borderThongTinBH, "Th\u00f4ng tin b\u1ea3o hi\u1ec3m");
	        titledBorderThongTinBH.setTitleFont(new Font("Serif", 1, 15));
	        titledBorderThongTinBH.setTitleColor(Color.RED);
	        titledBorderThongTinBH.setTitleJustification(1);
	        pnThongTinBaoHiem.setBorder(titledBorderThongTinBH);
	        final Calendar calendar = Calendar.getInstance();
	        final int yearNow = calendar.get(1);
	        (this.pnBaoHiemOto = new JPanel()).setLayout(new BorderLayout());
	        final JPanel pnThongTinBaoHiemOto = new JPanel();
	        pnThongTinBaoHiemOto.setLayout(new BoxLayout(pnThongTinBaoHiemOto, 1));
	        final JLabel lblHangSanXuat = new JLabel("H\u00e3ng s\u1ea3n xu\u1ea5t: ");
	        lblHangSanXuat.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblMauXe = new JLabel("M\u1eabu xe: ");
	        lblMauXe.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblBienSo = new JLabel("Bi\u1ec3n s\u1ed1 \u0111\u0103ng k\u00fd: ");
	        lblBienSo.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblNamMuaBaoHiemOto = new JLabel("N\u0103m mua BH: ");
	        lblNamMuaBaoHiemOto.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblGiaTriDinhGiaOto = new JLabel("Gi\u00e1 tr\u1ecb BH ($): ");
	        lblGiaTriDinhGiaOto.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblNamKtraBaoHiemOto = new JLabel("N\u0103m ki\u1ec3m tra: ");
	        lblNamKtraBaoHiemOto.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblDoRate = new JLabel("Rate t\u00e0i x\u1ebf: ");
	        lblDoRate.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JPanel pnHangSanXuat = new JPanel();
	        pnHangSanXuat.setLayout(new BorderLayout());
	        pnHangSanXuat.setBorder(BorderFactory.createEmptyBorder(10, 30, 5, 30));
	        final JPanel pnLblHangSanXuat = new JPanel();
	        pnLblHangSanXuat.setLayout(new BorderLayout());
	        pnLblHangSanXuat.add(lblHangSanXuat, "North");
	        final JPanel pnTxtHangSanXuat = new JPanel();
	        pnTxtHangSanXuat.setLayout(new BorderLayout());
	        pnTxtHangSanXuat.add(this.txtHangSanXuat = new JTextField(), "North");
	        pnHangSanXuat.add(pnLblHangSanXuat, "West");
	        pnHangSanXuat.add(pnTxtHangSanXuat, "Center");
	        final JPanel pnMauXe = new JPanel();
	        pnMauXe.setLayout(new BorderLayout());
	        pnMauXe.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblMauXe = new JPanel();
	        pnLblMauXe.setLayout(new BorderLayout());
	        pnLblMauXe.add(lblMauXe, "North");
	        final JPanel pnTxtMauXe = new JPanel();
	        pnTxtMauXe.setLayout(new BorderLayout());
	        pnTxtMauXe.add(this.txtMauXe = new JTextField(), "North");
	        pnMauXe.add(pnLblMauXe, "West");
	        pnMauXe.add(pnTxtMauXe, "Center");
	        final JPanel pnBienSoDangKy = new JPanel();
	        pnBienSoDangKy.setLayout(new BorderLayout());
	        pnBienSoDangKy.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblBienSoDangKy = new JPanel();
	        pnLblBienSoDangKy.setLayout(new BorderLayout());
	        pnLblBienSoDangKy.add(lblBienSo, "North");
	        final JPanel pnTxtBienSoDangKy = new JPanel();
	        pnTxtBienSoDangKy.setLayout(new BorderLayout());
	        pnTxtBienSoDangKy.add(this.txtBienSo = new JTextField(), "North");
	        pnBienSoDangKy.add(pnLblBienSoDangKy, "West");
	        pnBienSoDangKy.add(pnTxtBienSoDangKy, "Center");
	        final JPanel pnNamMuaBHOto = new JPanel();
	        pnNamMuaBHOto.setLayout(new BorderLayout());
	        pnNamMuaBHOto.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblNamMuaBHOto = new JPanel();
	        pnLblNamMuaBHOto.setLayout(new BorderLayout());
	        pnLblNamMuaBHOto.add(lblNamMuaBaoHiemOto, "North");
	        final JPanel pnTxtNamMuaBHOto = new JPanel();
	        pnTxtNamMuaBHOto.setLayout(new BorderLayout());
	        pnTxtNamMuaBHOto.add(this.txtNamMuaBHOto = new JTextField(), "North");
	        pnNamMuaBHOto.add(pnLblNamMuaBHOto, "West");
	        pnNamMuaBHOto.add(pnTxtNamMuaBHOto, "Center");
	        final JPanel pnGiaTriDinhGiaOto = new JPanel();
	        pnGiaTriDinhGiaOto.setLayout(new BorderLayout());
	        pnGiaTriDinhGiaOto.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblGiaTriDinhGiaOto = new JPanel();
	        pnLblGiaTriDinhGiaOto.setLayout(new BorderLayout());
	        pnLblGiaTriDinhGiaOto.add(lblGiaTriDinhGiaOto, "North");
	        final JPanel pnTxtGiaTriDinhGiaOto = new JPanel();
	        pnTxtGiaTriDinhGiaOto.setLayout(new BorderLayout());
	        pnTxtGiaTriDinhGiaOto.add(this.txtGiaTriDinhGiaOto = new JTextField(), "North");
	        pnGiaTriDinhGiaOto.add(pnLblGiaTriDinhGiaOto, "West");
	        pnGiaTriDinhGiaOto.add(pnTxtGiaTriDinhGiaOto, "Center");
	        final JPanel pnNamKtraBaoHiemOto = new JPanel();
	        pnNamKtraBaoHiemOto.setLayout(new BorderLayout());
	        pnNamKtraBaoHiemOto.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblNamKtraBaoHiemOto = new JPanel();
	        pnLblNamKtraBaoHiemOto.setLayout(new BorderLayout());
	        pnLblNamKtraBaoHiemOto.add(lblNamKtraBaoHiemOto, "North");
	        final JPanel pnTxtNamKtraBaoHiemOto = new JPanel();
	        pnTxtNamKtraBaoHiemOto.setLayout(new BorderLayout());
	        (this.txtNamKtraBHOto = new JTextField()).setText(String.valueOf(yearNow));
	        pnTxtNamKtraBaoHiemOto.add(this.txtNamKtraBHOto, "North");
	        pnNamKtraBaoHiemOto.add(pnLblNamKtraBaoHiemOto, "West");
	        pnNamKtraBaoHiemOto.add(pnTxtNamKtraBaoHiemOto, "Center");
	        final JPanel pnDoRateTaiXe = new JPanel();
	        pnDoRateTaiXe.setLayout(new BorderLayout());
	        pnDoRateTaiXe.setBorder(BorderFactory.createEmptyBorder(5, 30, 10, 30));
	        final JPanel pnLblDoRateTaiXe = new JPanel();
	        pnLblDoRateTaiXe.setLayout(new BorderLayout());
	        pnLblDoRateTaiXe.add(lblDoRate, "North");
	        final JPanel pnTxtDoRateTaiXe = new JPanel();
	        pnTxtDoRateTaiXe.setLayout(new BorderLayout());
	        final String[] rate = { "1", "2", "3", "4", "5" };
	        pnTxtDoRateTaiXe.add(this.comboRateTaiXe = new JComboBox<String>(rate), "North");
	        pnDoRateTaiXe.add(pnLblDoRateTaiXe, "West");
	        pnDoRateTaiXe.add(pnTxtDoRateTaiXe, "Center");
	        pnThongTinBaoHiemOto.add(pnHangSanXuat);
	        pnThongTinBaoHiemOto.add(pnMauXe);
	        pnThongTinBaoHiemOto.add(pnBienSoDangKy);
	        pnThongTinBaoHiemOto.add(pnNamMuaBHOto);
	        pnThongTinBaoHiemOto.add(pnGiaTriDinhGiaOto);
	        pnThongTinBaoHiemOto.add(pnNamKtraBaoHiemOto);
	        pnThongTinBaoHiemOto.add(pnDoRateTaiXe);
	        this.pnBaoHiemOto.add(pnThongTinBaoHiemOto, "North");
	        (this.pnBaoHiemNha = new JPanel()).setLayout(new BorderLayout());
	        final JPanel pnThongTinBaoHiemNha = new JPanel();
	        pnThongTinBaoHiemNha.setLayout(new BoxLayout(pnThongTinBaoHiemNha, 1));
	        final JLabel lblNamKtraBaoHiemNha = new JLabel("N\u0103m ki\u1ec3m tra BH: ");
	        lblNamKtraBaoHiemNha.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblNamMuaBaoHiemNha = new JLabel("N\u0103m mua BH: ");
	        lblNamMuaBaoHiemNha.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblGiaTriDinhGiaNha = new JLabel("Gi\u00e1 tr\u1ecb nh\u00e0 ($): ");
	        lblGiaTriDinhGiaNha.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JLabel lblGiaTriVatDung = new JLabel("Gi\u00e1 tr\u1ecb v\u1eadt d\u1ee5ng ($): ");
	        lblGiaTriVatDung.setPreferredSize(lblThuNhapHienTaiKH.getPreferredSize());
	        final JPanel pnNamMuaBaoHiemNha = new JPanel();
	        pnNamMuaBaoHiemNha.setLayout(new BorderLayout());
	        pnNamMuaBaoHiemNha.setBorder(BorderFactory.createEmptyBorder(10, 30, 5, 30));
	        final JPanel pnLblNamMuaBaoHiemNha = new JPanel();
	        pnLblNamMuaBaoHiemNha.setLayout(new BorderLayout());
	        pnLblNamMuaBaoHiemNha.add(lblNamMuaBaoHiemNha, "North");
	        final JPanel pnTxtNamMuaBaoHiemNha = new JPanel();
	        pnTxtNamMuaBaoHiemNha.setLayout(new BorderLayout());
	        pnTxtNamMuaBaoHiemNha.add(this.txtNamMuaBaoHiemNha = new JTextField(), "North");
	        pnNamMuaBaoHiemNha.add(pnLblNamMuaBaoHiemNha, "West");
	        pnNamMuaBaoHiemNha.add(pnTxtNamMuaBaoHiemNha, "Center");
	        final JPanel pnGiaTriDinhGiaNha = new JPanel();
	        pnGiaTriDinhGiaNha.setLayout(new BorderLayout());
	        pnGiaTriDinhGiaNha.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblGiaTriDinhGiaNha = new JPanel();
	        pnLblGiaTriDinhGiaNha.setLayout(new BorderLayout());
	        pnLblGiaTriDinhGiaNha.add(lblGiaTriDinhGiaNha, "North");
	        final JPanel pnTxtGiaTriDinhGiaNha = new JPanel();
	        pnTxtGiaTriDinhGiaNha.setLayout(new BorderLayout());
	        pnTxtGiaTriDinhGiaNha.add(this.txtGiaTriDinhGiaNha = new JTextField(), "North");
	        pnGiaTriDinhGiaNha.add(pnLblGiaTriDinhGiaNha, "West");
	        pnGiaTriDinhGiaNha.add(pnTxtGiaTriDinhGiaNha, "Center");
	        final JPanel pnGiaTriVatDung = new JPanel();
	        pnGiaTriVatDung.setLayout(new BorderLayout());
	        pnGiaTriVatDung.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
	        final JPanel pnLblGiaTriVatDung = new JPanel();
	        pnLblGiaTriVatDung.setLayout(new BorderLayout());
	        pnLblGiaTriVatDung.add(lblGiaTriVatDung, "North");
	        final JPanel pnTxtGiaTriVatDung = new JPanel();
	        pnTxtGiaTriVatDung.setLayout(new BorderLayout());
	        pnTxtGiaTriVatDung.add(this.txtGiaTriVatDung = new JTextField(), "North");
	        pnGiaTriVatDung.add(pnLblGiaTriVatDung, "West");
	        pnGiaTriVatDung.add(pnTxtGiaTriVatDung, "Center");
	        final JPanel pnNamKtraBaoHiemNha = new JPanel();
	        pnNamKtraBaoHiemNha.setLayout(new BorderLayout());
	        pnNamKtraBaoHiemNha.setBorder(BorderFactory.createEmptyBorder(5, 30, 10, 30));
	        final JPanel pnLblNamKtraBaoHiemNha = new JPanel();
	        pnLblNamKtraBaoHiemNha.setLayout(new BorderLayout());
	        pnLblNamKtraBaoHiemNha.add(lblNamKtraBaoHiemNha, "North");
	        final JPanel pnTxtNamKtraBaoHiemNha = new JPanel();
	        pnTxtNamKtraBaoHiemNha.setLayout(new BorderLayout());
	        (this.txtNamKtraBaoHiemNha = new JTextField()).setText(String.valueOf(yearNow));
	        pnTxtNamKtraBaoHiemNha.add(this.txtNamKtraBaoHiemNha, "North");
	        pnNamKtraBaoHiemNha.add(pnLblNamKtraBaoHiemNha, "West");
	        pnNamKtraBaoHiemNha.add(pnTxtNamKtraBaoHiemNha, "Center");
	        pnThongTinBaoHiemNha.add(pnNamMuaBaoHiemNha);
	        pnThongTinBaoHiemNha.add(pnGiaTriDinhGiaNha);
	        pnThongTinBaoHiemNha.add(pnGiaTriVatDung);
	        pnThongTinBaoHiemNha.add(pnNamKtraBaoHiemNha);
	        this.pnBaoHiemNha.add(pnThongTinBaoHiemNha, "North");
	        (this.pnBaoHiemThuNhap = new JPanel()).setLayout(new BorderLayout());
	        this.tabbedPane = new JTabbedPane();
	        final JScrollPane scrollPane = new JScrollPane(this.pnBaoHiemOto, 22, 30);
	        this.tabbedPane.addTab("B\u1ea3o hi\u1ec3m \u00d4t\u00f4", scrollPane);
	        pnThongTinBaoHiem.add(this.tabbedPane, "Center");
	        pnThongTin.add(pnThongTinKhachHang, "North");
	        pnThongTin.add(pnThongTinBaoHiem, "Center");
	        final JPanel pnChucNang = new JPanel();
	        pnChucNang.setLayout(new FlowLayout());
	        final Border borderChucNang = BorderFactory.createLineBorder(Color.BLUE);
	        final TitledBorder titledBorderChucNang = new TitledBorder(borderChucNang, "Ch\u1ecdn ch\u1ee9c n\u0103ng");
	        titledBorderChucNang.setTitleFont(new Font("Serif", 1, 15));
	        titledBorderChucNang.setTitleJustification(2);
	        titledBorderChucNang.setTitleColor(Color.RED);
	        pnChucNang.setBorder(titledBorderChucNang);
	        (this.btnTinhChiPhi = new JButton("T\u00ednh chi ph\u00ed")).setFont(new Font("Serif", 1, 13));
	        (this.btnTinhGiaTri = new JButton("T\u00ednh gi\u00e1 tr\u1ecb")).setFont(new Font("Serif", 1, 13));
	        (this.btnXuatThongTin = new JButton("Xu\u1ea5t th\u00f4ng tin")).setFont(new Font("Serif", 1, 13));
	        pnChucNang.add(this.btnTinhChiPhi);
	        pnChucNang.add(this.btnTinhGiaTri);
	        pnChucNang.add(this.btnXuatThongTin);
	        final Container con = this.getContentPane();
	        final JPanel pnMain = new JPanel();
	        pnMain.setLayout(new BorderLayout(5, 5));
	        pnMain.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
	        pnMain.add(pnTenCongTy, "North");
	        pnMain.add(pnChonLoaiBaoHiem, "West");
	        pnMain.add(pnThongTin, "Center");
	        pnMain.add(pnChucNang, "South");
	        con.add(pnMain);
	        
	       // this.setVisible(true);
	    }
		 private void addEvents() {
		        this.exitMenu.addActionListener(new ButtonListener());
		        this.aboutMenu.addActionListener(new ButtonListener());
		        this.radioBtnBaoHiemOto.addItemListener(new RadioButtonListener());
		        this.radioBtnBaoHiemNha.addItemListener(new RadioButtonListener());
		        this.radioBtnBaoHiemThuNhap.addItemListener(new RadioButtonListener());
		        this.btnTinhChiPhi.addActionListener(new ButtonListener());
		        this.btnTinhGiaTri.addActionListener(new ButtonListener());
		        this.btnXuatThongTin.addActionListener(new ButtonListener());
		        this.comboRateTaiXe.addActionListener(new ButtonListener());
		        this.txtTenKH.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtTuoiKH.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtDiaChiKH.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtThuNhapKH.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtHangSanXuat.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtMauXe.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtBienSo.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtNamMuaBHOto.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtGiaTriDinhGiaOto.getDocument().addDocumentListener(new TextFieldListener());
		        this.txtNamKtraBHOto.getDocument().addDocumentListener(new TextFieldListener());
		    }
//		 public void showWindow() {
//		       // this.setIconImage(new ImageIcon(Objects.requireNonNull(view.class.getResource("/images/logoCongTy.png"))).getImage());
//		        this.setSize(800, 600);
//		        this.setDefaultCloseOperation(3);
//		        this.setLocationRelativeTo(null);
//		        try {
//		            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		        }
//		        catch (Exception e) {
//		            e.printStackTrace();
//		        }
//		        this.setVisible(true);
//		    }
		 public void docDuLieu() {
		        this.tenKH = this.txtTenKH.getText().trim();
		        this.strTuoiKH = this.txtTuoiKH.getText().trim();
		        this.diaChiKH = this.txtDiaChiKH.getText().trim();
		        this.strThuNhapKH = this.txtThuNhapKH.getText().trim();
		        this.hangSanXuat = this.txtHangSanXuat.getText().trim();
		        this.mauXe = this.txtMauXe.getText().trim();
		        this.bienSo = this.txtBienSo.getText().trim();
		        this.strNamMuaBHOto = this.txtNamMuaBHOto.getText().trim();
		        this.strNamKtraBHOto = this.txtNamKtraBHOto.getText().trim();
		        this.strGiaTriOto = this.txtGiaTriDinhGiaOto.getText().trim();
		        this.rateTaiXe = (String)this.comboRateTaiXe.getSelectedItem();
		        this.strNamMuaBHNha = this.txtNamMuaBaoHiemNha.getText().trim();
		        this.strGiaTriNha = this.txtGiaTriDinhGiaNha.getText().trim();
		        this.strGiaTriVatDung = this.txtGiaTriVatDung.getText().trim();
		        this.strNamKtraBHNha = this.txtNamKtraBaoHiemNha.getText().trim();
		    }
		 private class ButtonListener implements ActionListener
		    {
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
		        
		        @Override
		        public void actionPerformed(final ActionEvent e) {
		            if (e.getSource() == view.this.exitMenu) {
		                System.exit(0);
		            }
		            if (e.getSource() == view.this.aboutMenu) {
		                final String strAuthorInfor = "T\u00e1c gi\u1ea3: Ph\u1ea1m Ng\u1ecdc H\u1ea3i\nMSSV: 20207601\nEmail: hai.pn207601@sis.hust.edu.vn\n";
		                JOptionPane.showMessageDialog(view.this, strAuthorInfor, "Th\u00f4ng tin", 1);
		            }
		            if (e.getSource() == view.this.btnTinhChiPhi) {
		                if (view.this.radioBtnBaoHiemOto.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemOto()) {
		                        final Insured baoHiemOto = (Insured)new InsuredCar(view.this.hangSanXuat, view.this.mauXe, view.this.bienSo, this.namMuaBaoHiemOto, this.giaTriOto, view.this.tenKH, this.doRateTaiXe, this.tuoiKH);
		                        final double chiPhiBaoHiem = baoHiemOto.getInsurancePremium(this.namKtraBaoHiemOto);
		                        JOptionPane.showMessageDialog(view.this, "Chi ph\u00ed b\u1ea3o hi\u1ec3m \u00f4 t\u00f4 l\u00e0: " + String.format("%.2f", chiPhiBaoHiem) + "$");
		                    }
		                }
		                if (view.this.radioBtnBaoHiemNha.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemNha()) {
		                        final Insured baoHiemNha = (Insured)new InsuredHouse(view.this.tenKH, this.tuoiKH, view.this.diaChiKH, this.giaTriNha, this.namMuaBaoHiemNha, this.giaTriVatDung);
		                        final double chiPhiBaoHiem = baoHiemNha.getInsurancePremium(this.namKtraBaoHiemNha);
		                        JOptionPane.showMessageDialog(view.this, "Chi ph\u00ed b\u1ea3o hi\u1ec3m nh\u00e0 l\u00e0: " + String.format("%.2f", chiPhiBaoHiem) + "$");
		                    }
		                }
		                if (view.this.radioBtnBaoHiemThuNhap.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH()) {
		                        final Insured baoHiemThuNhap = (Insured)new IncomeProtection(view.this.tenKH, this.tuoiKH, this.thuNhapKH);
		                        final double chiPhiBaoHiem = baoHiemThuNhap.getInsurancePremium(Calendar.getInstance().get(1));
		                        JOptionPane.showMessageDialog(view.this, "Chi ph\u00ed b\u1ea3o hi\u1ec3m thu nh\u1eadp l\u00e0: " + String.format("%.2f", chiPhiBaoHiem) + "$");
		                    }
		                }
		            }
		            if (e.getSource() == view.this.btnTinhGiaTri) {
		                if (view.this.radioBtnBaoHiemOto.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemOto()) {
		                        final Insured baoHiemOto = (Insured)new InsuredCar(view.this.hangSanXuat, view.this.mauXe, view.this.bienSo, this.namMuaBaoHiemOto, this.giaTriOto, view.this.tenKH, this.doRateTaiXe, this.tuoiKH);
		                        final double giaTriBaoHiem = baoHiemOto.getInsuranceValue(this.namKtraBaoHiemOto);
		                        JOptionPane.showMessageDialog(view.this, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m \u00f4 t\u00f4 l\u00e0: " + String.format("%.2f", giaTriBaoHiem) + "$");
		                    }
		                }
		                if (view.this.radioBtnBaoHiemNha.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemNha()) {
		                        final Insured baoHiemNha = (Insured)new InsuredHouse(view.this.tenKH, this.tuoiKH, view.this.diaChiKH, this.giaTriNha, this.namMuaBaoHiemNha, this.giaTriVatDung);
		                        final double giaTriBaoHiem = baoHiemNha.getInsuranceValue(this.namKtraBaoHiemNha);
		                        JOptionPane.showMessageDialog(view.this, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m nh\u00e0 l\u00e0: " + String.format("%.2f", giaTriBaoHiem) + "$");
		                    }
		                }
		                if (view.this.radioBtnBaoHiemThuNhap.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH()) {
		                        final Insured baoHiemThuNhap = (Insured)new IncomeProtection(view.this.tenKH, this.tuoiKH, this.thuNhapKH);
		                        final double giaTriBaoHiem = baoHiemThuNhap.getInsuranceValue(Calendar.getInstance().get(1));
		                        JOptionPane.showMessageDialog(view.this, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m thu nh\u1eadp l\u00e0: " + String.format("%.2f", giaTriBaoHiem) + "$");
		                    }
		                }
		            }
		            if (e.getSource() == view.this.btnXuatThongTin) {
		                if (view.this.radioBtnBaoHiemOto.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemOto()) {
		                        final String strTenKhachHang = "H\u1ecd v\u00e0 t\u00ean: " + view.this.tenKH + "\n";
		                        final String strTuoiKhachHang = "Tu\u1ed5i: " + this.tuoiKH + "\n";
		                        final String strDiaChiKhachHang = "\u0110\u1ecba ch\u1ec9: " + view.this.diaChiKH + "\n";
		                        final String strThuNhapKhachHang = "Thu nh\u1eadp hi\u1ec7n t\u1ea1i: " + String.format("%.2f", this.thuNhapKH) + "$\n";
		                        final String strHangXe = "H\u00e3ng xe: " + view.this.hangSanXuat + "\n";
		                        final String strMauXe = "M\u1eabu xe: " + view.this.mauXe + "\n";
		                        final String strBienSo = "Bi\u1ec3n s\u1ed1: " + view.this.bienSo + "\n";
		                        final String strNamMuaBaoHiem = "N\u0103m mua b\u1ea3o hi\u1ec3m: " + this.namMuaBaoHiemOto + "\n";
		                        final String strNamKtraGiaTriBaoHiem = "N\u0103m ki\u1ec3m tra gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + this.namKtraBaoHiemOto + "\n";
		                        final Insured baoHiemOto2 = (Insured)new InsuredCar(view.this.hangSanXuat, view.this.mauXe, view.this.bienSo, this.namMuaBaoHiemOto, this.giaTriOto, view.this.tenKH, this.doRateTaiXe, this.tuoiKH);
		                        final double chiPhiBaoHiem2 = baoHiemOto2.getInsurancePremium(this.namKtraBaoHiemOto);
		                        final double giaTriBaoHiem2 = baoHiemOto2.getInsuranceValue(this.namKtraBaoHiemOto);
		                        final String strChiPhiBaoHiem = "Chi ph\u00ed b\u1ea3o hi\u1ec3m: " + String.format("%.2f", chiPhiBaoHiem2) + "$\n";
		                        final String strGiaTriBaoHiem = "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + String.format("%.2f", giaTriBaoHiem2) + "$\n";
		                        JOptionPane.showMessageDialog(view.this, String.valueOf(strTenKhachHang) + strTuoiKhachHang + strDiaChiKhachHang + strThuNhapKhachHang + strHangXe + strMauXe + strBienSo + strNamMuaBaoHiem + strNamKtraGiaTriBaoHiem + strChiPhiBaoHiem + strGiaTriBaoHiem, "B\u1ea3o hi\u1ec3m \u00d4t\u00f4", 1);
		                    }
		                }
		                if (view.this.radioBtnBaoHiemNha.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH() && this.kiemTraThongTinBaoHiemNha()) {
		                        final String strTenKhachHang = "H\u1ecd v\u00e0 t\u00ean: " + view.this.tenKH + "\n";
		                        final String strTuoiKhachHang = "Tu\u1ed5i: " + this.tuoiKH + "\n";
		                        final String strDiaChiKhachHang = "\u0110\u1ecba ch\u1ec9: " + view.this.diaChiKH + "\n";
		                        final String strThuNhapKhachHang = "Thu nh\u1eadp hi\u1ec7n t\u1ea1i: " + String.format("%.2f", this.thuNhapKH) + "$\n";
		                        final String strNamMuaBaoHiem2 = "N\u0103m mua b\u1ea3o hi\u1ec3m: " + this.namMuaBaoHiemNha + "\n";
		                        final String strNamKtraGiaTriBaoHiem2 = "N\u0103m ki\u1ec3m tra gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + this.namKtraBaoHiemNha + "\n";
		                        final Insured baoHiemNha2 = (Insured)new InsuredHouse(view.this.tenKH, this.tuoiKH, view.this.diaChiKH, this.giaTriNha, this.namMuaBaoHiemNha, this.giaTriVatDung);
		                        final double chiPhiBaoHiem3 = baoHiemNha2.getInsurancePremium(this.namKtraBaoHiemNha);
		                        final double giaTriBaoHiem3 = baoHiemNha2.getInsuranceValue(this.namKtraBaoHiemNha);
		                        final String strChiPhiBaoHiem2 = "Chi ph\u00ed b\u1ea3o hi\u1ec3m: " + String.format("%.2f", chiPhiBaoHiem3) + "$\n";
		                        final String strGiaTriBaoHiem2 = "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m: " + String.format("%.2f", giaTriBaoHiem3) + "$\n";
		                        JOptionPane.showMessageDialog(view.this, String.valueOf(strTenKhachHang) + strTuoiKhachHang + strDiaChiKhachHang + strThuNhapKhachHang + strNamMuaBaoHiem2 + strNamKtraGiaTriBaoHiem2 + strChiPhiBaoHiem2 + strGiaTriBaoHiem2, "B\u1ea3o hi\u1ec3m nh\u00e0", 1);
		                    }
		                }
		                if (view.this.radioBtnBaoHiemThuNhap.isSelected()) {
		                	view.this.docDuLieu();
		                    if (this.kiemTraThongTinKH()) {
		                        final String strTenKhachHang = "H\u1ecd v\u00e0 t\u00ean: " + view.this.tenKH + "\n";
		                        final String strTuoiKhachHang = "Tu\u1ed5i: " + this.tuoiKH + "\n";
		                        final String strDiaChiKhachHang = "\u0110\u1ecba ch\u1ec9: " + view.this.diaChiKH + "\n";
		                        final String strThuNhapKhachHang = "Thu nh\u1eadp hi\u1ec7n t\u1ea1i: " + String.format("%.2f", this.thuNhapKH) + "$\n";
		                        final Insured baoHiemThuNhap2 = (Insured)new IncomeProtection(view.this.tenKH, this.tuoiKH, this.thuNhapKH);
		                        final double giaTriBaoHiem4 = baoHiemThuNhap2.getInsuranceValue(Calendar.getInstance().get(1));
		                        final double chiPhiBaoHiem3 = baoHiemThuNhap2.getInsurancePremium(Calendar.getInstance().get(1));
		                        final String strChiPhiBaoHiem3 = "Chi ph\u00ed b\u1ea3o hi\u1ec3m thu nh\u1eadp: " + String.format("%.2f", chiPhiBaoHiem3) + "$\n";
		                        final String strGiaTriBaoHiem3 = "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m thu nh\u1eadp: " + String.format("%.2f", giaTriBaoHiem4) + "$\n";
		                        JOptionPane.showMessageDialog(view.this, String.valueOf(strTenKhachHang) + strTuoiKhachHang + strDiaChiKhachHang + strThuNhapKhachHang + strChiPhiBaoHiem3 + strGiaTriBaoHiem3, "B\u1ea3o hi\u1ec3m thu nh\u1eadp", 1);
		                    }
		                }
		            }
		            if (e.getSource() == view.this.comboRateTaiXe) {
		            	view.this.rateTaiXe = (String)view.this.comboRateTaiXe.getSelectedItem();
		            }
		        }
		        private boolean kiemTraThongTinKH() {
		            if (view.this.tenKH.equals("") || view.this.strTuoiKH.equals("") || view.this.diaChiKH.equals("") || view.this.strThuNhapKH.equals("")) {
		                JOptionPane.showMessageDialog(view.this, "Th\u00f4ng tin kh\u00e1ch h\u00e0ng kh\u00f4ng \u0111\u01b0\u1ee3c \u0111\u1ec3 tr\u1ed1ng!", "Error", 0);
		                return false;
		            }
		            try {
		                this.tuoiKH = Integer.parseInt(view.this.strTuoiKH);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "Tu\u1ed5i kh\u00e1ch h\u00e0ng kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            try {
		                this.thuNhapKH = Double.parseDouble(view.this.strThuNhapKH);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "Thu nh\u1eadp kh\u00e1ch h\u00e0ng kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            return true;
		        }
		        private boolean kiemTraThongTinBaoHiemOto() {
		            if (view.this.hangSanXuat.equals("") || view.this.mauXe.equals("") || view.this.bienSo.equals("") || view.this.strNamMuaBHOto.equals("") || view.this.strGiaTriOto.equals("") || view.this.strNamKtraBHOto.equals("") || view.this.rateTaiXe.equals("")) {
		                JOptionPane.showMessageDialog(view.this, "Th\u00f4ng tin b\u1ea3o hi\u1ec3m kh\u00f4ng \u0111\u01b0\u1ee3c \u0111\u1ec3 tr\u1ed1ng!", "Error", 0);
		                return false;
		            }
		            try {
		                this.namMuaBaoHiemOto = Integer.parseInt(view.this.strNamMuaBHOto);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "N\u0103m mua b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            try {
		                this.giaTriOto = Double.parseDouble(view.this.strGiaTriOto);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            try {
		                this.namKtraBaoHiemOto = Integer.parseInt(view.this.strNamKtraBHOto);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "N\u0103m ki\u1ec3m tra kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            this.doRateTaiXe = Integer.parseInt(view.this.rateTaiXe);
		            return true;
		        }
		        private boolean kiemTraThongTinBaoHiemNha() {
		            if (view.this.strNamMuaBHNha.equals("") || view.this.strGiaTriNha.equals("") || view.this.strGiaTriVatDung.equals("") || view.this.strNamKtraBHNha.equals("")) {
		                JOptionPane.showMessageDialog(view.this, "Th\u00f4ng tin b\u1ea3o hi\u1ec3m kh\u00f4ng \u0111\u01b0\u1ee3c \u0111\u1ec3 tr\u1ed1ng!", "Error", 0);
		                return false;
		            }
		            try {
		                this.namMuaBaoHiemNha = Integer.parseInt(view.this.strNamMuaBHNha);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "N\u0103m mua b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            try {
		                this.giaTriNha = Double.parseDouble(view.this.strGiaTriNha);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "Gi\u00e1 tr\u1ecb b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            try {
		                this.giaTriVatDung = Double.parseDouble(view.this.strGiaTriVatDung);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "Gi\u00e1 tr\u1ecb v\u1eadt d\u1ee5ng kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            try {
		                this.namKtraBaoHiemNha = Integer.parseInt(view.this.strNamKtraBHNha);
		            }
		            catch (Exception exception) {
		                JOptionPane.showMessageDialog(view.this, "N\u0103m mua b\u1ea3o hi\u1ec3m kh\u00f4ng h\u1ee3p l\u1ec7!", "Error", 0);
		                return false;
		            }
		            return true;
		        }
		    }
		 private class RadioButtonListener implements ItemListener
		    {
		        @Override
		        public void itemStateChanged(final ItemEvent e) {
		            if (e.getSource() == view.this.radioBtnBaoHiemOto && view.this.radioBtnBaoHiemOto.isSelected()) {
		            	view.this.tabbedPane.removeTabAt(0);
		                final JScrollPane scrollPane = new JScrollPane(view.this.pnBaoHiemOto, 22, 30);
		                view.this.tabbedPane.addTab("B\u1ea3o hi\u1ec3m \u00d4t\u00f4", scrollPane);
		            }
		            if (e.getSource() == view.this.radioBtnBaoHiemNha && view.this.radioBtnBaoHiemNha.isSelected()) {
		            	view.this.tabbedPane.removeTabAt(0);
		                final JScrollPane scrollPane = new JScrollPane(view.this.pnBaoHiemNha, 22, 30);
		                view.this.tabbedPane.addTab("B\u1ea3o hi\u1ec3m nh\u00e0", scrollPane);
		            }
		            if (e.getSource() == view.this.radioBtnBaoHiemThuNhap && view.this.radioBtnBaoHiemThuNhap.isSelected()) {
		            	view.this.tabbedPane.removeTabAt(0);
		                final JScrollPane scrollPane = new JScrollPane(view.this.pnBaoHiemThuNhap, 22, 30);
		                view.this.tabbedPane.addTab("B\u1ea3o hi\u1ec3m thu nh\u1eadp", scrollPane);
		            }
		        }
		    }
		 private class TextFieldListener implements DocumentListener
		    {
		        @Override
		        public void insertUpdate(final DocumentEvent e) {
		            view.this.docDuLieu();
		        }
		        
		        @Override
		        public void removeUpdate(final DocumentEvent e) {
		            view.this.docDuLieu();
		        }
		        
		        @Override
		        public void changedUpdate(final DocumentEvent e) {
		            view.this.docDuLieu();
		        }
		    }

}
