import tkinter as tk

root = tk.Tk()

text_widget = tk.Text(root, wrap=tk.NONE)
text_widget.grid(column=0, row=0, sticky=(tk.N, tk.S, tk.E, tk.W))

root.columnconfigure(0, weight=1)
root.rowconfigure(0, weight=1)

root.title("Notepad")
root.geometry("5000x5000")

root.mainloop()