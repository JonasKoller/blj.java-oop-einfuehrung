using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace OOP_AnimalSample
{
    public class Dog : Animal
    {
        /// <summary>
        /// Constructor. 
        /// </summary>
        public Dog()
        {
            MessageBox.Show("A Dog was born.");
        }

        /// <summary>
        /// Destructor.
        /// </summary>
        ~Dog()
        {
            MessageBox.Show("A Dog died.");
        }

        /// <summary>
        /// Dog says hello. 
        /// </summary>
        public override void SayHello()   // (the key-word "override" indicates that the method of the base class is overriden)
        {
            MessageBox.Show("Wuff!");
        }
    }
}
