import turtle

# Inisialisasi turtle dan layar
screen = turtle.Screen()
screen.bgpic("background.gif")  # Ganti dengan nama file gambar latar belakang Anda

# Fungsi untuk menggerakkan latar belakang
def move_background():
    global x
    x -= 1
    screen.bgpic("background.gif")  # Ganti dengan nama file gambar latar belakang Anda
    screen.ontimer(move_background, 10)

# Fungsi untuk menampilkan lirik
def display_lyrics(lyrics):
    turtle.color("white")
    turtle.penup()
    turtle.goto(-100, -100)  # Ganti dengan posisi yang Anda inginkan
    turtle.pendown()
    turtle.write(lyrics, font=("Arial", 16, "normal"))

# Inisialisasi variabel x
x = 0

# Panggil fungsi untuk memulai animasi dan menampilkan lirik
move_background()
display_lyrics("'Cause my love is mine, all mine")

# Tampilkan layar
turtle.mainloop()
