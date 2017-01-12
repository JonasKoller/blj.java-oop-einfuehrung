using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace OOP_AnimalSample
{
    public class Cat : Animal
    {
        /// <summary>
        /// Constructor.
        /// </summary>
        public Cat()
        {
            MessageBox.Show("A cat was born.");
        }

        /// <summary>
        /// Destructor.
        /// </summary>
        ~Cat()
        {
            MessageBox.Show("A cat died.");
        }

     
        /// <summary>
        /// Cat says hello.
        /// </summary>
        public override void SayHello()
        {
            MessageBox.Show("Miau!");
        }
    }
}
