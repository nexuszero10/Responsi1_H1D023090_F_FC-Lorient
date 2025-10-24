# Responsi 1 Mobile — Paket FC Lorient

**Nama**       : Tansah Jumeneng Prayogi  
**NIM**        : H1D023090  
**Shift Baru** : F  
**Shift Lama** : G  

---

## Demo Aplikasi
![Screen_recording_20251024_203857+(1)+(1)](https://github.com/user-attachments/assets/080eae07-d111-46ce-8adf-8f3daa88b3fd)

---

## Flow Data Team Squad (Daftar Pemain)

1. `FragmentPemain` meminta data squad ke `TeamViewModel`.
2. `TeamViewModel` melakukan request ke API menggunakan Retrofit.
3. Server API mengembalikan data pemain (squad).
4. `TeamViewModel` menyimpan data hasil request ke dalam `LiveData`.
5. `FragmentPemain` melakukan `observe` pada LiveData dan menerima data terbaru.
6. Data ditampilkan pada `RecyclerView` menggunakan `PlayerAdapter`.
7. Ketika salah satu pemain dipilih, data dikirim ke `FragmentDetailPemain` menggunakan `navigate()`.
8. `FragmentDetailPemain` menerima data dan menampilkan detail pada layout XML.

---

## Flow Data Coach (Pelatih)

1. `FragmentCoach` meminta data coach ke `TeamViewModel`.
2. `TeamViewModel` melakukan request data coach ke API menggunakan Retrofit.
3. API mengembalikan detail coach (nama, tanggal lahir, negara, kontrak, dll.).
4. `TeamViewModel` menyimpan data ke `LiveData`.
5. `FragmentCoach` melakukan `observe` LiveData dan menampilkan data coach ke UI (TextView / ImageView).

---

