#!/usr/bin/python3

# Übungsaufgabe Vigenere-Cipher
# J. Uhrmann, 2020
#
# Die zu entschlüsselnden Ciphertexte wurden mit dem nachfolgendem
# Programm erstellt.

import sys


def encrypt(character):
    character = character.upper()

    encrypt.pos += 1
    if encrypt.pos > len(encrypt.password):
        encrypt.pos = 1

    if ord(character) < ord('A') or ord(character) > ord('Z'):
        return character
    
    code = ord(character) + ord(encrypt.password[encrypt.pos - 1]) - ord('A')
    if code > ord('Z'):
        code = code - 26

    return chr(code)
  
encrypt.pos=0

infilename=sys.argv[1]

with open(infilename, "r") as infile:
    content = infile.read()

encrypt.password = input("Passwort: ").upper()

ciphertext = ''.join(map(encrypt, content))

outfilename=infilename + '.enc'
with open(outfilename, "w", encoding='utf-8') as outfile:
    outfile.write(ciphertext)

