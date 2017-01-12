using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KontoSample
{
    public class Konto
    {
        // Internes (privates) Feld respektive Klassenvariable, 
        // die den aktuellen Saldo des Kontos speichert.
        private int _saldo = 0;

        /// <summary>
        /// Default Konstruktor. Kann überschrieben werden, z.B. um den Saldo zu initialisieren.
        /// </summary>
        public Konto()
        {

        }

        /// <summary>
        /// Gibt den Saldo zurück.
        /// </summary>
        public int Saldo
        {
            // Der 'get'-Block gibt den Wert des privaten Feldes _saldo zurück.
            get
            {   
                return _saldo;
            }
            // Der 'set'-Block ist mit 'private' deklariert, d.h. _saldo kann von aussen nicht überschrieben werden. 
            // Dies ist wichtig -> Warum??? 
            private set         
            {
                _saldo = value;
            }
        }

        /// <summary>
        /// Diese Methode erhöht den Saldo um einen bestimmten Betrag.
        /// </summary>
        /// <param name="betrag">Der Einzahlungsbetrag</param>
        public void Einzahlen(int betrag)
        {
            _saldo += betrag;
        }

        /// <summary>
        /// Diese Methode reduziert den Saldo um einen bestimmten Betrag. 
        /// Falls der Saldo nach Reduktion ins Minus fallen würde, wird ein Fehler (nicht erlaubt) "geworfen".
        /// </summary>
        /// <param name="betrag">Der Auszahlungsbetrag</param>
        public void Auszahlen(int betrag)
        {
            if (_saldo < betrag)
                throw new Exception("Nicht erlaubt! Der Saldo darf nicht im Minus sein!");

            _saldo -= betrag;
        }
    }
}
