# Zybo-Z7-20-Linux
Linux build for the Zybo-Z7-20 dev board.

Builds using Petalinux 2019.2 from Xilinx

# Manifest File - Google Repo
The Google Repo tool can be used to download the correct dependencies for this project.

To use:

``` 
    $ repo init \  
        -u ssh://git@github.com/brymatPC/Zybo-Z7-20-Linux \
        -b Petalinux_2019.2
    $ repo sync
```

# Modules working
* One LED
* Ethernet

