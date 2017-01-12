namespace OOP_AnimalSample
{
    partial class MainForm
    {
        /// <summary>
        /// Erforderliche Designervariable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Verwendete Ressourcen bereinigen.
        /// </summary>
        /// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Vom Windows Form-Designer generierter Code

        /// <summary>
        /// Erforderliche Methode für die Designerunterstützung.
        /// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
        /// </summary>
        private void InitializeComponent()
        {
            this.buttonDog = new System.Windows.Forms.Button();
            this.buttonCat = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // buttonDog
            // 
            this.buttonDog.Location = new System.Drawing.Point(20, 19);
            this.buttonDog.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.buttonDog.Name = "buttonDog";
            this.buttonDog.Size = new System.Drawing.Size(189, 36);
            this.buttonDog.TabIndex = 0;
            this.buttonDog.Text = "Hund...";
            this.buttonDog.UseVisualStyleBackColor = true;
            this.buttonDog.Click += new System.EventHandler(this.buttonDog_Click);
            // 
            // buttonCat
            // 
            this.buttonCat.Location = new System.Drawing.Point(20, 63);
            this.buttonCat.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.buttonCat.Name = "buttonCat";
            this.buttonCat.Size = new System.Drawing.Size(189, 36);
            this.buttonCat.TabIndex = 1;
            this.buttonCat.Text = "Katze...";
            this.buttonCat.UseVisualStyleBackColor = true;
            this.buttonCat.Click += new System.EventHandler(this.buttonCat_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(518, 116);
            this.Controls.Add(this.buttonCat);
            this.Controls.Add(this.buttonDog);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 13F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "MainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "OOP AnimalSample";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button buttonDog;
        private System.Windows.Forms.Button buttonCat;
    }
}

