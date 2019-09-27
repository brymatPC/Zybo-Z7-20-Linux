#!/bin/bash

petalinux-package --boot --force --fsbl images/linux/zynq_fsbl.elf --fpga zyboZ7Bd_wrapper.bit --u-boot

cp images/linux/BOOT.BIN /media/dev/boot/
cp images/linux/image.ub /media/dev/boot/