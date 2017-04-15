def voo(pa, cb, pb, ca):
    
    #hpa = int(pa[:2])
    mpa = int(pa[3:]) + 60*int(pa[:2])
    #hcb = int(cb[:2])
    mcb = int(cb[3:]) + 60*int(cb[:2])

    #hpb = int(pb[:2])
    mpb = int(pb[3:]) + 60*int(pb[:2])
    #hca = int(ca[:2])
    mca = int(ca[3:]) + 60*int(ca[:2])

    ida = mcb - mpa
    volta = mca - mpb
    fuso = (ida - volta)/2
    dura = ida - fuso
    fuso = fuso/60

    return dura, fuso

    
    


def main():
    entrada = raw_input().split(' ')
    pa = entrada[0]
    cb = entrada[1]
    pb = entrada[2]
    ca = entrada[3]

    resp = voo(pa, cb, pb, ca)
    print str(resp[0]) + ' ' + str(resp[1])

main()
