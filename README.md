**— — ✈ Project Java: Simulasi Bandara**

**📌 Deskripsi** 

Projek ini dibuat untuk mempelajari **OOP (Object Oriented Programming) di Java** dengan konsep:

_**Inheritance (extends)**_ → pewarisan atribut dari superclass.

_**Interface (implements)**_ → mendefinisikan method yang wajib diimplementasikan.

_**Constructor**_ → fungsi khusus untuk menginisialisasi objek.

Projek ini mensimulasikan alur kerja "_Pesawat Komersial"_ di bandara, mulai dari persiapan, penerbangan, hingga pelayanan penumpang.

**📂 Struktur Kode**

* **Superclass** : Pesawat

  * _Atribut_: maskapai, kapasitas

* **Subclass**: PesawatKomersial

  * Mewarisi Pesawat dengan extends
  * Mengimplementasikan 3 interface

* **Interface**:

  1. _Persiapan_ → boarding(), isiBahanBakar(), cekMesin()
  2. _Penerbangan_ → lepasLandas(), terbang(), mendarat()
  3. _Pelayanan_ → sajikanMakanan(), umumkanInfo(), hiburanPesawat()

* **Main Class**: MainBandara

  * Membuat objek PesawatKomersial
  * Menjalankan urutan langkah simulasi penerbangan


**📘 Materi Terkait**

_**🔹 implements (Interface di Java)**_

* Interface adalah _kontra_k yang berisi daftar method tanpa isi (hanya nama method).
* Jika sebuah class menggunakan implements, maka class tersebut _wajib mengisi semua method_ dari interface.

_**🔹 Constructor**_

* Constructor adalah *method khusus* yang dipanggil saat objek dibuat dengan new.
* Fungsinya untuk *mengisi nilai awal (inisialisasi)* atribut dalam class.

Maka otomatis atribut maskapai dan kapasitas langsung terisi.

_**🔹 Super**_

* super adalah keyword di Java yang digunakan dalam inheritance (pewarisan class).
Fungsinya ada 2 utama:
    1. Memanggil constructor dari superclass (parent class) → supaya atribut dari parent juga ikut diinisialisasi.
    2. Mengakses method/atribut superclass yang mungkin sama namanya dengan subclass.

**📌 Kesimpulan**

Projek ini menunjukkan bagaimana:

* **_extends_** → pewarisan atribut dan method.
* **_implements_** → kewajiban sebuah class untuk menjalankan kontrak interface.
* **_constructor_** → menginisialisasi objek agar langsung siap digunakan.

Dengan menggabungkan semuanya, kita bisa membuat alur sistem yang *rapi, modular, dan mudah dikembangkan*.
