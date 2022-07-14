# Java Specification 


# JSON BODY:
# Example 1
    {
        "filters": [],
        "sorts": [],
        "page": null,
        "size": null
    }

# Example 2 :
    {
        "filters": [ {
                "key": "name",
                "operator": "EQUAL",
                "field_type": "STRING",
                "value": "CentOS"
        }],

        "sorts": [{
        "key": "releaseDate",
        "direction": "ASC"
        }],

        "page": null,
        "size": null
    }

