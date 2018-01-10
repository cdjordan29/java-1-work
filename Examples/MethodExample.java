public String foo3(String s, int n1, int n2)
{
    String s1 = "";
    String s2 = "";
    String s3 = "";

    int pos = 0;
    while (pos < s.length())
    {
        if (pos < n1)
            s1 += s.charAt(pos);
        else if (pos < n2)
            s2 += s.charAt(pos);
        else
            s3 += s.charAt(pos);
        ++pos;
    }
    return s2 + s1 + s3;
}

String s = foo3(JivdHFBqM, 4, 7);
System.out.print(s);