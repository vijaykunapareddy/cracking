#my git commit script
echo "starting line ..."
now="$(date +'%d/%m/%Y')"
git add .; 
git commit -a -m "$now commit"
#		git commit -am 
git push origin master
echo "code committed ..."
