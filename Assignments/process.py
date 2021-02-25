def apply(x):
    return "{" + x + "}"

f = open("input.txt")

with open("output.txt","w") as o:
    for line in f.readlines():
        new = []
        for part in line.split('|'):
            part = part.rstrip()
            if "," in part:
                part = apply(part)
                if ";" in part:
                    str = []
                    for each in part.split(","):
                        if ";" in each:
                            str.append(apply(each.replace(";",",")))
                        else:
                            str.append(each)
                    new.append(",".join(str))
                else:
                    new.append(part)
            elif ";" in part:
                new.append(apply(part.replace(";",",")))
            else:
                new.append(part)
        
        o.write("|".join(new)+"\n")

        

