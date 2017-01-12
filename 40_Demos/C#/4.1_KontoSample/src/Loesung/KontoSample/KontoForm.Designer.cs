namespace KontoSample
{
    partial class KontoForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.buttonAus = new System.Windows.Forms.Button();
            this.textBoxSaldo = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.buttonEin = new System.Windows.Forms.Button();
            this.textBoxBetrag = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // buttonAus
            // 
            this.buttonAus.Location = new System.Drawing.Point(263, 72);
            this.buttonAus.Name = "buttonAus";
            this.buttonAus.Size = new System.Drawing.Size(240, 42);
            this.buttonAus.TabIndex = 0;
            this.buttonAus.Text = "Abheben";
            this.buttonAus.UseVisualStyleBackColor = true;
            this.buttonAus.Click += new System.EventHandler(this.buttonAus_Click);
            // 
            // textBoxSaldo
            // 
            this.textBoxSaldo.BackColor = System.Drawing.SystemColors.Control;
            this.textBoxSaldo.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.textBoxSaldo.Location = new System.Drawing.Point(146, 139);
            this.textBoxSaldo.Name = "textBoxSaldo";
            this.textBoxSaldo.Size = new System.Drawing.Size(119, 25);
            this.textBoxSaldo.TabIndex = 1;
            this.textBoxSaldo.Text = "0";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 138);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(128, 26);
            this.label1.TabIndex = 2;
            this.label1.Text = "Kontostand:";
            // 
            // buttonEin
            // 
            this.buttonEin.Location = new System.Drawing.Point(263, 24);
            this.buttonEin.Name = "buttonEin";
            this.buttonEin.Size = new System.Drawing.Size(240, 42);
            this.buttonEin.TabIndex = 3;
            this.buttonEin.Text = "Einzahlen";
            this.buttonEin.UseVisualStyleBackColor = true;
            this.buttonEin.Click += new System.EventHandler(this.buttonEin_Click);
            // 
            // textBoxBetrag
            // 
            this.textBoxBetrag.Location = new System.Drawing.Point(98, 27);
            this.textBoxBetrag.Name = "textBoxBetrag";
            this.textBoxBetrag.Size = new System.Drawing.Size(146, 32);
            this.textBoxBetrag.TabIndex = 4;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 30);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(82, 26);
            this.label2.TabIndex = 5;
            this.label2.Text = "Betrag:";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(12F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(518, 177);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textBoxBetrag);
            this.Controls.Add(this.buttonEin);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBoxSaldo);
            this.Controls.Add(this.buttonAus);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(7, 6, 7, 6);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Konto-GUI";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonAus;
        private System.Windows.Forms.TextBox textBoxSaldo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button buttonEin;
        private System.Windows.Forms.TextBox textBoxBetrag;
        private System.Windows.Forms.Label label2;
    }
}

