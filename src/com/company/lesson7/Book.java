package com.company.lesson7;

public class Book
{
        private String name, writer;

        public Book(String name, String writer) {
            this.name = name;
            this.writer = writer;
        }

        Book() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }
    }


