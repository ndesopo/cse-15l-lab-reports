# Copying whole directories with scp -r (an epic blog post)
- You can use `-r` to recursively scp files to a server
- `scp ieng6 MarkdownParse.java` would copy just the markdown-parse java file to my ieng6 account
- Alternatively, `scp -r markdown-parse ieng6:~/filename` recursively copies my file into a new directory on the server "filename"
    - Recursive copying means copying the contents inside the markdown-parse directory (including the java file), and if there are any subdirectories within that directory, it recursively copies those as well.

## Copying my whole markdown-parse directory to my ieng6 account
- After navigating to my github repositories folder on my client, I used recursive scp 