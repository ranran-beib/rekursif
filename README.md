PERCOBAAN 1
  1. Fungsi dengan guna memanggil diri sendiri sampai kondisi tertentu (base case) terpenuhi
  2. Sama, 120
PERCOBAAN 2
  1. Proses berjalan sampai pangkat bernilai 0 (base case)
  2. 2 x 2 x 2 x 2 x 2 x 1 = 32
PERCOBAAN 3
  1. Base case: if (tahun == 0)
     Recursion call: 1.11 * hitungLaba(saldo, tahun - 1)
  2. hitungLaba(100000,3)
     - 1.11 x hitungLaba(100000,2)
     - 1.11 x 1.11 x hitungLaba(100000,1)
     - 1.11 x 1.11 x 1.11 x hitungLaba(100000,0)
     - 1.11^3 x 100000 = +- 136.763
