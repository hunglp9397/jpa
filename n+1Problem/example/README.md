#---------- N + 1 Problem----------

# Trong package ex_1.
Entity "Post" có mqh 1-N với "Post Comment"

khi thực hiện query get all Post, Thì câu lệnh hibernate "Select Post COmment" vẫn thực hiện đối với mỗi thực thể Post
--> Đây chính là N+1 Problem

Lưu ý : FetchType Eager là mặc định của @OnetoOne và @OneToMany. Lại càng ko được 
        Dùng FetchType Lazy mặc dù kết quả trả ra không bao gồm "Post Comment" tuy nhiên hibernate vẫn query post comment

    {
        "id": 1,
        "title": "High-Performance Java Persistence - Part 1",
        "postComments": []
    }


DO đó Best solution là dùng "Fetch Join"


# Trong package ex_2. Vẫn là giải quyết N+1 problem nhưng dùng EntityGraphs
Có hai loại của EntityGraphs : Fetch and Load


FETCH : [Default của graphs]. Khi dùng, thì entity Cha được xác định fetchType là Eager. entity con được xác định fetchType là Lazy

LOAD : Khi dùng, entity cha được xác định fetchType là Eager. entity con được xác định với fetch Type mặc định )
