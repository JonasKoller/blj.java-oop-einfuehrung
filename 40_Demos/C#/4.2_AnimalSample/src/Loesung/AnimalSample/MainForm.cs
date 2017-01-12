using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace OOP_AnimalSample
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void buttonDog_Click(object sender, EventArgs e)
        {
            Dog d = new Dog();

            d.SayHello();
            //Greet(d);

            // kill the dog?  
            d = null;

            // the dog is still alive until the garbage collector gets him ^^...
            GC.Collect(); 
            
        }

        private void buttonCat_Click(object sender, EventArgs e)
        {
            Cat c = new Cat();
            c.SayHello();
            //Greet(c);
        }

        private void Greet(Animal a)
        {
            // cat or dog? we only know this at runtime (late binding)
            a.SayHello();
        }
    }
}
