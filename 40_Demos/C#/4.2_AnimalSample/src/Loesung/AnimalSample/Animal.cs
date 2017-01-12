using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace OOP_AnimalSample
{

    /// <summary>
    /// Abstract means: one can't create an instance of this class.
    /// </summary>
    public abstract class Animal
    {
        public abstract void SayHello();  // Abstract means: must be implemented in child classes

        /// <summary>
        /// Constructor.
        /// </summary>
        public Animal()
        {
            MessageBox.Show("An animal was born.");
        }

        /// <summary>
        /// Constructor. 
        /// </summary>
        ~Animal()
        {
            MessageBox.Show("An animal died.");
        }
    }
}
