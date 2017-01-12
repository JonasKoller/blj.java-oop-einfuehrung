using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace KontoSample
{
    public partial class KontoForm : Form
    {
        // ein Objekt der Klasse 'Konto' instanzieren 
        private Konto _konto = new Konto();  

        public KontoForm()
        {
            InitializeComponent();
        }

        private void buttonEin_Click(object sender, EventArgs e)
        {
            int betrag = Convert.ToInt32(textBoxBetrag.Text);
            _konto.Einzahlen(betrag);

            textBoxSaldo.Text = _konto.Saldo.ToString();
        }

        private void buttonAus_Click(object sender, EventArgs e)
        {
            int betrag = Convert.ToInt32(textBoxBetrag.Text);
            
            try
            {
                _konto.Auszahlen(betrag);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Fehler: " + ex.Message);
            }

            textBoxSaldo.Text = _konto.Saldo.ToString();
        }
    }
}
